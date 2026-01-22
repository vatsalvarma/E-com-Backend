package an.E_com.web;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    private final CategoryService service;

    public CategoryController(CategoryService service) { this.service = service; }

    @GetMapping
    public List<Category> getAll() { return service.getAll(); }

    @PostMapping
    public Category create(@RequestBody Category c) { return service.save(c); }
}
