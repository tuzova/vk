package domain;

public class Place {            // описание места (если оно добавлено)
    private int id;             // идентификатор места
    private String title;       // название места
    private int latitude;       // географическая широта, заданная в градусах (от -90 до 90)
    private int longitude;      // географическая долгота, заданная в градусах (от -90 до 90)
    private int created;        // дата создания места в Unixtime
    private String icon;        // иконка места, URL изображения
    private int checkins;       // число отметок в этом месте
    private int updated;        // дата обновления места в Unixtime
    private int type;           // тип места
    private int country;        // идентификатор страны
    private int city;           // идентификатор города
    private String address;     // адрес

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getCheckins() {
        return checkins;
    }

    public void setCheckins(int checkins) {
        this.checkins = checkins;
    }

    public int getUpdated() {
        return updated;
    }

    public void setUpdated(int updated) {
        this.updated = updated;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

