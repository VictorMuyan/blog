package com.luo.blog.service;


import com.luo.blog.entity.BlogTagCount;
import com.luo.blog.utils.PageQueryUtil;
import com.luo.blog.utils.PageResult;

import java.util.List;

public interface TagService {

    PageResult getBlogTagPage(PageQueryUtil pageUtil);

    int getTotalTags();

    Boolean saveTag(String tagName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogTagCount> getBlogTagCountForIndex();
}
