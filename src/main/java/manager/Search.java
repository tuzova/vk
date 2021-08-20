package manager;

import domain.Post;

public class Search {
    private Post[] posts;
    private int ownerId;            // идентификатор пользователя или сообщества
    private char postId;            // идентификатор записи на стене, положительное число
    private String domain;          // короткий адрес пользователя или сообщества
    private String query;           // поисковой запрос, максимальная длина 9000
    private boolean ownersOnly;     // 1 — возвращать только записи от имени владельца стены. Может принимать значения 1 или 0
    private int count = 20;         // количество записей, которые необходимо вернуть. Положительное число, по умолчанию 20, максимальное значение 100
    private int offset;             // смещение, необходимо для получения определенного подмножества результатов. Положительное число, по умолчанию 0

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public char getPostId() {
        return postId;
    }

    public void setPostId(char postId) {
        this.postId = postId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public boolean isOwnersOnly() {
        return ownersOnly;
    }

    public void setOwnersOnly(boolean ownersOnly) {
        this.ownersOnly = ownersOnly;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Post[] searchPost(int ownerId, char postId, String domain, String query, int ownersOnly, int count, int offset) {
        return null;
    }
}


