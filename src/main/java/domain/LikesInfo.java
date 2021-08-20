package domain;

public class LikesInfo {            // информация о лайках к записи
    private int count;              // число пользователей, которым понравилась запись
    private boolean userLikes;      // наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет) (int изначально)
    private boolean canLike;        // информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может) (int изначально)
    private boolean canPublish;     // информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может) (int изначально)

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}





