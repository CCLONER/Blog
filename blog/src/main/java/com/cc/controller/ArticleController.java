package com.cc.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cc.domain.entity.Article;
import com.cc.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 文章表(Article)表控制层
 *
 * @author makejava
 * @since 2023-07-31 23:34:47
 */
@RestController
@RequestMapping("article")
public class ArticleController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleService articleService;

    /**
     * 查询所有数据
     *
     * @return 所有数据
     */
    @GetMapping("/list")
    public List<Article> selectAll() {
        return articleService.list();
    }

}

