package vas.VasSprring.service;

import vas.VasSprring.entity.Blog;
import vas.VasSprring.entity.User;

import java.util.List;

public interface BlogService {
    List<Blog> getAll();

    Blog getById(int id);

    void saveBlog(Blog blog);

    void deleteBlog(int id);
}
