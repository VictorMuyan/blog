package com.luo.blog.service;

import com.luo.blog.entity.BlogCategory;
import com.luo.blog.utils.PageQueryUtil;
import com.luo.blog.utils.PageResult;

import java.util.List;

public interface CategoryService {
    PageResult getBlogCategoryPage(PageQueryUtil pageUtil);

    int getTotalCategories();

    Boolean saveCategory(String categoryName,String categoryIcon);

    Boolean updateCategory(Integer categoryId, String categoryName, String categoryIcon);

    Boolean deleteBatch(Integer[] ids);

    List<BlogCategory> getAllCategories();
}
