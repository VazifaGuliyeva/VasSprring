package vas.VasSprring.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vas.VasSprring.entity.Blog;
import vas.VasSprring.entity.User;
import vas.VasSprring.manager.BlogManager;
import vas.VasSprring.manager.UserManager;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
@AllArgsConstructor
public class BlogController{
    private final BlogManager blogManager;


    @GetMapping
    public List<Blog> getall(){

        return blogManager.getAll();
    }
    @GetMapping("/{id}")
    public Blog getById(@PathVariable int id){

        return blogManager.getById(id);
    }
    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED)
    public void saveBlog(@RequestBody Blog blog){
        blogManager.saveBlog(blog);
    }
    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable int id){

        blogManager.deleteBlog(id);
    }
}
