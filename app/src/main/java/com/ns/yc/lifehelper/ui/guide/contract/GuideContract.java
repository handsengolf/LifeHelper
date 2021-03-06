package com.ns.yc.lifehelper.ui.guide.contract;


import com.ns.yc.lifehelper.base.mvp1.BasePresenter;
import com.ns.yc.lifehelper.base.mvp1.BaseView;

/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/9/14
 * 描    述：启动页
 * 修订历史：
 * ================================================
 */
public interface GuideContract {

    interface View extends BaseView {
        void showGuideLogo(String logo);
    }

    interface Presenter extends BasePresenter {
        void cacheHomeNewsData();
        void cacheFindNewsData();
        void cacheFindBottomNewsData();
        void cacheHomePileData();
        void startGuideImage();
    }


}
