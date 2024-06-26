package com.arya.Online.Food.Ordering.controller;

import com.arya.Online.Food.Ordering.model.Category;
import com.arya.Online.Food.Ordering.model.User;
import com.arya.Online.Food.Ordering.service.CategoryService;
import com.arya.Online.Food.Ordering.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private UserService userServiceImp;

    @PostMapping("/admin/category")
    public ResponseEntity<Category> createCategory(@RequestBody Category category,
                                                   @RequestHeader ("Authorization")String jwt) throws Exception {
        User user= userServiceImp.findUserByJwtToken(jwt);
        Category createCategory=categoryService.createCategory(category.getName(), user.getId());
        return new ResponseEntity<>(createCategory, HttpStatus.CREATED);

    }

    @GetMapping("/category/restaurant")
    public ResponseEntity<List<Category>> getRestaurantCategory(@RequestHeader("Authorization")String jwt)throws Exception {
        User user= userServiceImp.findUserByJwtToken(jwt);
        List<Category> categories=categoryService.findCategoryByRestaurantId(user.getId());
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
