package com.luo.blog.service;

import com.luo.blog.controller.vo.BlogDetailVO;
import com.luo.blog.controller.vo.SimpleBlogListVO;
import com.luo.blog.entity.Blog;
import com.luo.blog.utils.PageQueryUtil;
import com.luo.blog.utils.PageResult;

import java.util.List;

public interface BlogService {
    String saveBlog(Blog blog);

    PageResult getBlogsPage(PageQueryUtil pageUtil);

    Boolean deleteBatch(Integer[] ids);

    int getTotalBlogs();

    Blog getBlogById(Long blogId);

    String updateBlog(Blog blog);

    PageResult getBlogsForIndexPage(int page);

    List<SimpleBlogListVO> getBlogListForIndexPage(int type);

    BlogDetailVO getBlogDetail(Long blogId);

    PageResult getBlogsPageByTag(String tagName, int page);

    PageResult getBlogsPageByCategory(String categoryId, int page);

    PageResult getBlogsPageBySearch(String keyword, int page);

    BlogDetailVO getBlogDetailBySubUrl(String subUrl);
}
