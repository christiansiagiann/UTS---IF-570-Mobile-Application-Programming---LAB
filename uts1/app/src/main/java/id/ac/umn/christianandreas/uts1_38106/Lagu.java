package id.ac.umn.christianandreas.uts1_38106;

import android.os.Parcel;
import android.os.Parcelable;

public class Lagu implements Parcelable {
    private String judul;
    private String penyanyi;
    private String laguURI;

    protected Lagu(Parcel in) {
        judul = in.readString();
        penyanyi = in.readString();
        laguURI = in.readString();
    }

    public static final Creator<Lagu> CREATOR = new Creator<Lagu>() {
        @Override
        public Lagu createFromParcel(Parcel in) {
            return new Lagu(in);
        }

        @Override
        public Lagu[] newArray(int size) {
            return new Lagu[size];
        }
    };

    public String getLaguURI() {
        return laguURI;
    }

    public void setLaguURI(String laguURI) {
        this.laguURI = laguURI;
    }

    public Lagu(String judul, String penyanyi, String laguURI) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.laguURI = laguURI;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.penyanyi);
        dest.writeString(this.laguURI);
    }

    public void readFromParcel(Parcel source) {
        this.judul = source.readString();
        this.penyanyi = source.readString();
    }
}
