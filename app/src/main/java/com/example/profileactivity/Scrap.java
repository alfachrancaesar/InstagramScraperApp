package com.example.profileactivity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Scrap {
    @SerializedName("Caption 1")
    @Expose
    private String caption1;

    @SerializedName("Caption 2")
    @Expose
    private String caption2;

    @SerializedName("Caption 3")
    @Expose
    private String caption3;

    @SerializedName("Media 1")
    @Expose
    private String media1;

    @SerializedName("Media 2")
    @Expose
    private String media2;

    @SerializedName("Media 3")
    @Expose
    private String media3;

    @SerializedName("Profile Bio")
    @Expose
    private String profileBio;

    @SerializedName("Profile Name")
    @Expose
    private String profileName;

    @SerializedName("Profile Number of Followers")
    @Expose
    private String profileNumberOfFollowers;

    @SerializedName("Profile Number of Following")
    @Expose
    private String profileNumberOfFollowing;

    @SerializedName("Profile Number of Medias")
    @Expose
    private String profileNumberOfMedias;

    @SerializedName("Profile Pict URL")
    @Expose
    private String profilePictURL;

    @SerializedName("Profile Username")
    @Expose
    private String profileUsername;

    @SerializedName("Total Comments 1")
    @Expose
    private String totalcomments1;

    @SerializedName("Total Comments 2")
    @Expose
    private String totalcomments2;

    @SerializedName("Total Comments 3")
    @Expose
    private String totalcomments3;

    @SerializedName("Total Likes 1")
    @Expose
    private String totallikes1;

    @SerializedName("Total Likes 2")
    @Expose
    private String totallikes2;

    @SerializedName("Total Likes 3")
    @Expose
    private String totallikes3;

    @SerializedName("Comment")
    @Expose
    private String comment;

    @SerializedName("Comment Owner ID")
    @Expose
    private String commentOwnerID;

    public String getCaption1() {
        return caption1;
    }
    public String getCaption2() {
        return caption2;
    }
    public String getCaption3() {
        return caption3;
    }
    public String getMedia1() {
        return media1;
    }
    public String getMedia2() {
        return media2;
    }
    public String getMedia3() {
        return media3;
    }
    public String getProfileBio() {
        return profileBio;
    }
    public String getProfileName() {
        return profileName;
    }
    public String getProfileNumberOfFollowers() {
        return profileNumberOfFollowers;
    }
    public String getProfileNumberOfFollowing() {
        return profileNumberOfFollowing;
    }
    public String getProfileNumberOfMedias() {
        return profileNumberOfMedias;
    }
    public String getProfilePictURL() {
        return profilePictURL;
    }
    public String getProfileUsername() {
        return profileUsername;
    }
    public String getTotalcomments1() {
        return totalcomments1;
    }
    public String getTotalcomments2() {
        return totalcomments2;
    }
    public String getTotalcomments3() {
        return totalcomments3;
    }
    public String getTotallikes1() {
        return totallikes1;
    }
    public String getTotallikes2() {
        return totallikes2;
    }
    public String getTotallikes3() {
        return totallikes3;
    }

//    @SerializedName("author")
//    @Expose
//    private String author;
//    @SerializedName("first_sentence")
//    @Expose
//    private String firstSentence;
//    @SerializedName("id")
//    @Expose
//    private Integer id;
//    @SerializedName("title")
//    @Expose
//    private String title;
//    @SerializedName("year_published")
//    @Expose
//    private String yearPublished;
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public String getFirstSentence() {
//        return firstSentence;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getYearPublished() {
//        return yearPublished;
//    }

//    @SerializedName("login")
//    @Expose
//    private String login;
//    @SerializedName("id")
//    @Expose
//    private Integer id;
//    @SerializedName("node_id")
//    @Expose
//    private String nodeId;
//    @SerializedName("avatar_url")
//    @Expose
//    private String avatarUrl;
//    @SerializedName("gravatar_id")
//    @Expose
//    private String gravatarId;
//    @SerializedName("url")
//    @Expose
//    private String url;
//    @SerializedName("html_url")
//    @Expose
//    private String htmlUrl;
//    @SerializedName("followers_url")
//    @Expose
//    private String followersUrl;
//    @SerializedName("following_url")
//    @Expose
//    private String followingUrl;
//    @SerializedName("gists_url")
//    @Expose
//    private String gistsUrl;
//    @SerializedName("starred_url")
//    @Expose
//    private String starredUrl;
//    @SerializedName("subscriptions_url")
//    @Expose
//    private String subscriptionsUrl;
//    @SerializedName("organizations_url")
//    @Expose
//    private String organizationsUrl;
//    @SerializedName("repos_url")
//    @Expose
//    private String reposUrl;
//    @SerializedName("events_url")
//    @Expose
//    private String eventsUrl;
//    @SerializedName("received_events_url")
//    @Expose
//    private String receivedEventsUrl;
//    @SerializedName("type")
//    @Expose
//    private String type;
//    @SerializedName("site_admin")
//    @Expose
//    private Boolean siteAdmin;
//    @SerializedName("name")
//    @Expose
//    private String name;
//    @SerializedName("company")
//    @Expose
//    private String company;
//    @SerializedName("blog")
//    @Expose
//    private String blog;
//    @SerializedName("location")
//    @Expose
//    private Object location;
//    @SerializedName("email")
//    @Expose
//    private Object email;
//    @SerializedName("hireable")
//    @Expose
//    private Object hireable;
//    @SerializedName("bio")
//    @Expose
//    private Object bio;
//    @SerializedName("public_repos")
//    @Expose
//    private Integer publicRepos;
//    @SerializedName("public_gists")
//    @Expose
//    private Integer publicGists;
//    @SerializedName("followers")
//    @Expose
//    private Integer followers;
//    @SerializedName("following")
//    @Expose
//    private Integer following;
//    @SerializedName("created_at")
//    @Expose
//    private String createdAt;
//    @SerializedName("updated_at")
//    @Expose
//    private String updatedAt;
//
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login) {
//        this.login = login;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getNodeId() {
//        return nodeId;
//    }
//
//    public void setNodeId(String nodeId) {
//        this.nodeId = nodeId;
//    }
//
//    public String getAvatarUrl() {
//        return avatarUrl;
//    }
//
//    public void setAvatarUrl(String avatarUrl) {
//        this.avatarUrl = avatarUrl;
//    }
//
//    public String getGravatarId() {
//        return gravatarId;
//    }
//
//    public void setGravatarId(String gravatarId) {
//        this.gravatarId = gravatarId;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public String getHtmlUrl() {
//        return htmlUrl;
//    }
//
//    public void setHtmlUrl(String htmlUrl) {
//        this.htmlUrl = htmlUrl;
//    }
//
//    public String getFollowersUrl() {
//        return followersUrl;
//    }
//
//    public void setFollowersUrl(String followersUrl) {
//        this.followersUrl = followersUrl;
//    }
//
//    public String getFollowingUrl() {
//        return followingUrl;
//    }
//
//    public void setFollowingUrl(String followingUrl) {
//        this.followingUrl = followingUrl;
//    }
//
//    public String getGistsUrl() {
//        return gistsUrl;
//    }
//
//    public void setGistsUrl(String gistsUrl) {
//        this.gistsUrl = gistsUrl;
//    }
//
//    public String getStarredUrl() {
//        return starredUrl;
//    }
//
//    public void setStarredUrl(String starredUrl) {
//        this.starredUrl = starredUrl;
//    }
//
//    public String getSubscriptionsUrl() {
//        return subscriptionsUrl;
//    }
//
//    public void setSubscriptionsUrl(String subscriptionsUrl) {
//        this.subscriptionsUrl = subscriptionsUrl;
//    }
//
//    public String getOrganizationsUrl() {
//        return organizationsUrl;
//    }
//
//    public void setOrganizationsUrl(String organizationsUrl) {
//        this.organizationsUrl = organizationsUrl;
//    }
//
//    public String getReposUrl() {
//        return reposUrl;
//    }
//
//    public void setReposUrl(String reposUrl) {
//        this.reposUrl = reposUrl;
//    }
//
//    public String getEventsUrl() {
//        return eventsUrl;
//    }
//
//    public void setEventsUrl(String eventsUrl) {
//        this.eventsUrl = eventsUrl;
//    }
//
//    public String getReceivedEventsUrl() {
//        return receivedEventsUrl;
//    }
//
//    public void setReceivedEventsUrl(String receivedEventsUrl) {
//        this.receivedEventsUrl = receivedEventsUrl;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public Boolean getSiteAdmin() {
//        return siteAdmin;
//    }
//
//    public void setSiteAdmin(Boolean siteAdmin) {
//        this.siteAdmin = siteAdmin;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }
//
//    public String getBlog() {
//        return blog;
//    }
//
//    public void setBlog(String blog) {
//        this.blog = blog;
//    }
//
//    public Object getLocation() {
//        return location;
//    }
//
//    public void setLocation(Object location) {
//        this.location = location;
//    }
//
//    public Object getEmail() {
//        return email;
//    }
//
//    public void setEmail(Object email) {
//        this.email = email;
//    }
//
//    public Object getHireable() {
//        return hireable;
//    }
//
//    public void setHireable(Object hireable) {
//        this.hireable = hireable;
//    }
//
//    public Object getBio() {
//        return bio;
//    }
//
//    public void setBio(Object bio) {
//        this.bio = bio;
//    }
//
//    public Integer getPublicRepos() {
//        return publicRepos;
//    }
//
//    public void setPublicRepos(Integer publicRepos) {
//        this.publicRepos = publicRepos;
//    }
//
//    public Integer getPublicGists() {
//        return publicGists;
//    }
//
//    public void setPublicGists(Integer publicGists) {
//        this.publicGists = publicGists;
//    }
//
//    public Integer getFollowers() {
//        return followers;
//    }
//
//    public void setFollowers(Integer followers) {
//        this.followers = followers;
//    }
//
//    public Integer getFollowing() {
//        return following;
//    }
//
//    public void setFollowing(Integer following) {
//        this.following = following;
//    }
//
//    public String getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(String createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public String getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(String updatedAt) {
//        this.updatedAt = updatedAt;
//    }
}
