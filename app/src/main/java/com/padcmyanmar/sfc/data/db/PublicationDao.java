package com.padcmyanmar.sfc.data.db;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;

import com.padcmyanmar.sfc.data.vo.NewsVO;
import com.padcmyanmar.sfc.data.vo.PublicationVO;

/**
 * Created by ZNMSW on 09-Jun-18.
 */
public interface PublicationDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long insertPublication(PublicationVO publicationVO);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    long[] insertPublcations(PublicationVO... publicationVOS);
}
