package com.luo.blog.service;

import com.luo.blog.entity.BlogLink;
import com.luo.blog.utils.PageQueryUtil;
import com.luo.blog.utils.PageResult;

import java.util.List;
import java.util.Map;

public interface LinkService {

    PageResult getBlogLinkPage(PageQueryUtil pageUtil);

    int getTotalLinks();

    Boolean saveLink(BlogLink link);

    BlogLink selectById(Integer id);

    Boolean updateLink(BlogLink tempLink);

    Boolean deleteBatch(Integer[] ids);

    Map<Byte, List<BlogLink>> getLinksForLinkPage();
}

