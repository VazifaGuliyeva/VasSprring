package vas.VasSprring.manager;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import vas.VasSprring.entity.Blog;
import vas.VasSprring.repository.BlogRepository;
import vas.VasSprring.service.BlogService;

import java.util.List;
@AllArgsConstructor
@Service
public class BlogManager implements BlogService {
    private final BlogRepository blogRepository;




    @Override
    public List<Blog> getAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog getById(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public void saveBlog(Blog blog) {

        blogRepository.save(blog);

    }

    @Override
    public void deleteBlog(int id) {


    }
}
