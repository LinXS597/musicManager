package cn.edu.zucc.musicmanager.model;

public class SongComment {

    private int ckeyid;
    private String commentId;
    private String songid;
    private String userid;
    private String content;
    private Long sendtime;
    private Long likecount;

    public int getCkeyid() {
        return ckeyid;
    }

    public void setCkeyid(int ckeyid) {
        this.ckeyid = ckeyid;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getSendtime() {
        return sendtime;
    }

    public void setSendtime(Long sendtime) {
        this.sendtime = sendtime;
    }

    public Long getLikecount() {
        return likecount;
    }

    public void setLikecount(Long likecount) {
        this.likecount = likecount;
    }

    @Override
    public String toString() {
        return "SongComment{" +
                "ckeyid='" + ckeyid + '\'' +
                ", commentId='" + commentId + '\'' +
                ", singid='" + songid + '\'' +
                ", userid='" + userid + '\'' +
                ", context='" + content + '\'' +
                ", sendtime=" + sendtime +
                ", likecount=" + likecount +
                '}';
    }
}
