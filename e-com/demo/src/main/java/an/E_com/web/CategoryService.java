package an.E_com.web;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository repo;

    public CategoryService(CategoryRepository repo) { this.repo = repo; }

    public List<Category> getAll() { return repo.findAll(); }
    public Category save(Category c) { return repo.save(c); }
}
