package cn.edu.zucc.musicmanager.model;

public class SongInfo {

    private int keyid;
    private String songid;
    private String playid;
    private String songname;
    private String albumid;
    private String singerid;
    private String songlyric;

    public String getSingerid() {
        return singerid;
    }

    public void setSingerid(String singerid) {
        this.singerid = singerid;
    }

    public String getSonglyric() {
        return songlyric;
    }

    public void setSonglyric(String songlyric) {
        this.songlyric = songlyric;
    }

    public int getKeyid() {
        return keyid;
    }

    public void setKeyid(int keyid) {
        this.keyid = keyid;
    }

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid;
    }

    public String getPlayid() {
        return playid;
    }

    public void setPlayid(String playid) {
        this.playid = playid;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getAlbumid() {
        return albumid;
    }

    public void setAlbumid(String albumid) {
        this.albumid = albumid;
    }

    @Override
    public String toString() {
        return "SongInfo{" +
                "keyid=" + keyid +
                ", songid='" + songid + '\'' +
                ", playid='" + playid + '\'' +
                ", songname='" + songname + '\'' +
                ", albumid='" + albumid + '\'' +
                ", singerid='" + singerid + '\'' +
                ", songlyric='" + songlyric + '\'' +
                '}';
    }
}
