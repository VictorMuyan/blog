package com.luo.blog.service;

import com.luo.blog.entity.BlogComment;
import com.luo.blog.utils.PageQueryUtil;
import com.luo.blog.utils.PageResult;

public interface CommentService {
    Boolean addComment(BlogComment blogComment);

    PageResult getCommentsPage(PageQueryUtil pageUtil);

    int getTotalComments();

    Boolean checkDone(Integer[] ids);

    Boolean deleteBatch(Integer[] ids);

    Boolean reply(Long commentId, String replyBody);

    PageResult getCommentPageByBlogIdAndPageNum(Long blogId, int page);
}
