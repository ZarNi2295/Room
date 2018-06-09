package com.padcmyanmar.sfc.data.db;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.padcmyanmar.sfc.data.vo.NewsVO;

import java.util.List;

/**
 * Created by ZNMSW on 09-Jun-18.
 */
public interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insertNews(NewsVO newsVO);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long[] insertNews(NewsVO... newsVOS);

   /* @Query("SELECT * FROM news")
    LiveData<List<NewsVO>> getAllAttractions();

    @Query("DELETE FROM news")
    void deleteAll();*/
}
