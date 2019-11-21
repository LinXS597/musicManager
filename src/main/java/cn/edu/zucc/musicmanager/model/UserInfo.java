package cn.edu.zucc.musicmanager.model;



public class UserInfo {

    private int uid;
    private String userid;
    private String nickname;
    private int provience;
    private int city;
    private long birthday;
    private int gender;
    private int followed;
    private int follows;
    private int eventCount;
    private int playlistCount;
    private long createtime;
    private int playlistBeSubscribedCount;
    private String signature;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getProvience() {
        return provience;
    }

    public void setProvience(int provience) {
        this.provience = provience;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getFollowed() {
        return followed;
    }

    public void setFollowed(int followed) {
        this.followed = followed;
    }

    public int getFollows() {
        return follows;
    }

    public void setFollows(int follows) {
        this.follows = follows;
    }

    public int getEventCount() {
        return eventCount;
    }

    public void setEventCount(int eventCount) {
        this.eventCount = eventCount;
    }

    public int getPlaylistCount() {
        return playlistCount;
    }

    public void setPlaylistCount(int playlistCount) {
        this.playlistCount = playlistCount;
    }

    public long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(long createtime) {
        this.createtime = createtime;
    }


    public int getPlaylistBeSubscribedCount() {
        return playlistBeSubscribedCount;
    }

    public void setPlaylistBeSubscribedCount(int playlistBeSubscribedCount) {
        this.playlistBeSubscribedCount = playlistBeSubscribedCount;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "uid=" + uid +
                ", userid='" + userid + '\'' +
                ", nickname='" + nickname + '\'' +
                ", provience=" + provience +
                ", city=" + city +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", followed=" + followed +
                ", follows=" + follows +
                ", eventCount=" + eventCount +
                ", playlistCount=" + playlistCount +
                ", createtime=" + createtime +
                ", playlistBeSubscribedCount=" + playlistBeSubscribedCount +
                ", signature='" + signature + '\'' +
                '}';
    }
}
