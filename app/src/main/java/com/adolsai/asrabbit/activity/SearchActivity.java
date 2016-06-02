package com.adolsai.asrabbit.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.adolsai.asrabbit.R;
import com.adolsai.asrabbit.adapter.PostAdapter;
import com.adolsai.asrabbit.base.AsRabbitBaseActivity;
import com.adolsai.asrabbit.model.Post;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by Administrator on 2015/11/9.
 */
public class SearchActivity extends AsRabbitBaseActivity implements
        AdapterView.OnItemClickListener {
    @Bind(R.id.lv_search)
    ListView mListView;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    String search = null;

    private PostAdapter mAdapter;

    private List<Post> lists;

    //******************生命周期区*******************************************************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActivity(R.layout.activity_search, savedInstanceState);

    }

    @Override
    protected void initViews() {
        lists = new ArrayList<>();
//        StatusBarCompat.compat(this, getResources().getColor(R.attr.base_sys_bar_bg));
        mAdapter = new PostAdapter(activity, lists);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(this);
    }

    @Override
    protected void initData() {
        search = getIntent().getStringExtra("search");
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("搜索结果");
        mToolbar.setNavigationIcon(R.mipmap.ic_search);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSearchData();

    }


    //*************************事件区****************************************************************
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }


    //******************自定义方法区******************************************************************
    private void getSearchData() {

    }


}
