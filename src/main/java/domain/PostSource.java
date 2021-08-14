package domain;

public class PostSource {       // информация о способе размещения записи
    private String type;        // тип источника
    private String platform;    // название платформы, если оно доступно. Возможные значения: android; iphone; wphone
    private String data;        // тип действия (только для type = vk или widget)
    private String url;         // URL ресурса, с которого была опубликована запись

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}





