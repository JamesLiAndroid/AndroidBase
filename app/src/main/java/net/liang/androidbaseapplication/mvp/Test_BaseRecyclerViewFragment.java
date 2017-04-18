package net.liang.androidbaseapplication.mvp;

import android.support.v4.app.FragmentTransaction;

import net.liang.androidbaseapplication.R;
import net.liang.appbaselibrary.base.BaseAppCompatActivity;
import net.liang.appbaselibrary.base.mvp.MvpPresenter;

public class Test_BaseRecyclerViewFragment extends BaseAppCompatActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_test__base_recycler_view_fragment;
    }

    @Override
    protected MvpPresenter getPresenter() {
        return null;
    }

    @Override
    public void init() {
        super.init();

        setToolbarCentel(true,"Fragment列表示例");

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame_layout, new RecyclerViewFragment());
        transaction.commit();
    }
}
