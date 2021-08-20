package domain;

public class Post {
    private int id;                     // идентификатор записи
    private int ownerId;                // идентификатор владельца стены
    private int fromId;                 // идентификатор автора записи
    private int createdBy;              // идентификатор администратора, который опубликовал запись
    private int date;                   // время публикации записи
    private String text;                // текст записи
    private int replyOwnerId;           // идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;            // идентификатор записи, в ответ на которую была оставлена текущая
    private boolean friendsOnly;        // true, если запись была создана с опцией «Только для друзей» (int изначально)
    private String postType;            // тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    private int signerId;               // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private boolean canPin;             // может ли текущий пользователь закрепить запись (1 — может, 0 — не может)
    private boolean canDelete;          // может ли текущий пользователь удалить запись (1 — может, 0 — не может)
    private boolean canEdit;            // может ли текущий пользователь редактировать запись (1 — может, 0 — не может)
    private int isPinned;               // информация о том, что запись закреплена
    private boolean markedAsAds;        // true, если запись содержит отметку "реклама" (int изначально)
    private boolean isFavorite;         // true, если объект добавлен в закладки у текущего пользователя
    private int postponedId;            // идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
    private CommentsInfo commentsInfo;  // метод CommentsInfo.java - информация о комментариях к записи
    private Copyright copyright;        // метод Copyright.java - источник материала
    private LikesInfo likesInfo;        // метод LikesInfo.java - информация о лайках к записи
    private RepostsInfo repostsInfo;    // метод RepostsInfo.java - информация о репостах записи («Рассказать друзьям»)
    private ViewsInfo viewsInfo;        // метод ViewsInfo.java - информация о просмотрах записи
    private PostSource postSource;      // метод PostSource.java - информация о способе размещения записи
    private Geo geo;                    // метод Geo.java - информация о местоположении
    private Donut donut;                // метод Donut.java - информация о записи VK Donut
    private Complain complain;          // метод Complain.java - отправка жалобы на запись


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public String getPostType() {
        return postType;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getSignerId() {
        return signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }

    public Complain getComplain() {
        return complain;
    }

    public void setComplain(Complain complain) {
        this.complain = complain;
    }
}

