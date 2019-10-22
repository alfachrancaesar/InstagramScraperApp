from flask import Flask, jsonify, request
from igramscraper.instagram import Instagram
import json

app = Flask(__name__)
instagram = Instagram()
instagram.with_credentials('username', 'password')
instagram.login()

username = 'username_target'
account = instagram.get_account(username)
medias = instagram.get_medias(username, 10)
media1 = medias[0]
media2 = medias[1]
media3 = medias[2]

# Ini buat ngambil data Comments di Media
comments1 = []
comments1 = instagram.get_media_comments_by_code(media1.short_code,25)
commin1 = [{
	'Comment Owner ID': comment.identifier,
	'Comment': comment.text
} for comment in comments1['comments']]

comments2 = []
comments2 = instagram.get_media_comments_by_code(media2.short_code,25)
commin2 = [{
	'Comment Owner ID': comment.identifier,
	'Comment': comment.text
} for comment in comments2['comments']]

comments3 = []
comments3 = instagram.get_media_comments_by_code(media3.short_code,25)
commin3 = [{
	'Comment Owner ID': comment.identifier,
	'Comment': comment.text
} for comment in comments3['comments']]

# Ini buat ngambil data Following di Logged Account
following = []
following = instagram.get_following(account.identifier, 50, 25, delayed=True) 
foling_user = [{
	'Account ID': following_user.identifier,
	'Account Username': following_user.username,
	'Account Full Name': following_user.full_name,
	'Account Biography': following_user.biography
} for following_user in following['accounts']]

# Ini buat ngambil data Followers di Logged Account
followers = []
followers = instagram.get_followers(account.identifier, 50, 25, delayed=True)
foler_user = [{
	'Account ID': follower.identifier,
	'Account Username': follower.username,
	'Account Full Name': follower.full_name,
	'Account Biography': follower.biography
} for follower in followers['accounts']]


@app.route('/', methods=['GET', 'POST'])
def index():
	some_json = request.get_json()
	return jsonify({
		'Profile Username': account.username,
		'Profile Name': account.full_name,
		'Profile Bio': account.biography,
		'Profile Number of Medias': account.media_count,
        'Profile Following': foling_user,
		'Profile Followers': foler_user,
		'Profile Number of Followers': account.followed_by_count,
		'Profile Number of Following': account.follows_count,
        'Profile Pict URL' : account.get_profile_picture_url(),
        
		'Media 1': media1.image_high_resolution_url,
		'Caption 1': media1.caption,
		'Total Comments 1': media1.comments_count,
		'Total Likes 1': media1.likes_count,
		'Comments 1': commin1,
        
        'Media 2': media2.image_high_resolution_url,
		'Caption 2': media2.caption,
		'Total Comments 2': media2.comments_count,
		'Total Likes 2': media2.likes_count,
		'Comments 2': commin2,
        
        'Media 3': media3.image_high_resolution_url,
		'Caption 3': media3.caption,
		'Total Comments 3': media3.comments_count,
		'Total Likes 3': media3.likes_count,
		'Comments 3': commin3,
        
		})

if __name__ == '__main__':
	app.run(debug=True)		


# For getting information about account you don't need to auth:


# Available fields
# print('Account info:')
# print('Id', account.identifier)
# print('Username', account.username)
# print('Full name', account.full_name)
# print('Biography', account.biography)
# print('Profile pic url', account.get_profile_picture_url())
# print('External Url', account.external_url)
# print('Number of published posts', account.media_count)
# print('Number of followers', account.followed_by_count)
# print('Number of follows', account.follows_count)
# print('Is private', account.is_private)
# print('Is verified', account.is_verified)
