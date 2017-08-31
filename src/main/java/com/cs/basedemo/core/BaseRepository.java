package com.cs.basedemo.core;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by cs on 2017/8/31.
 */
@NoRepositoryBean
public interface BaseRepository<T> extends PagingAndSortingRepository<T, Integer>,
        JpaSpecificationExecutor<T> {

}
