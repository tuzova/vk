package manager;

import domain.Post;

public class PostManager {
    private Post[] posts;       // массив объектов класса Post
    private Search search;      // метод позволяет искать записи на стене в соответствии с заданными критериями.
    private Delete delete;      // метод удаляет запись со стены

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public Delete getDelete() {
        return delete;
    }

    public void setDelete(Delete delete) {
        this.delete = delete;
    }
}

