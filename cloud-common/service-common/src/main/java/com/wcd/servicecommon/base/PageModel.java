package com.wcd.servicecommon.base;

import com.github.pagehelper.Page;
import lombok.Data;

import java.util.List;

/**
 * @description: 分页model
 * @author: Will
 * @date: 2020/4/10 17:52
 * @param <T>
 */
@Data
public class PageModel<T> {

    private Integer page;
    private Integer rows;
    private Integer start;
    private Long total;
    private List<T> results;

    public PageModel(Integer page, Integer rows) {
        super();
        this.page = page;
        this.rows = rows;
        this.start = (page - 1) * rows;
    }

    public void initData(Page<T> pageT) {

        this.results = pageT.getResult();
        this.total = pageT.getTotal();
    }
}
