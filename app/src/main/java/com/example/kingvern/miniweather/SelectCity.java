package com.example.kingvern.miniweather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.edu.pku.kingvern.app.MyApplication;
import cn.edu.pku.kingvern.bean.City;

/**
 * Created by kingvern on 10/18/17.
 */

public class SelectCity extends Activity implements View.OnClickListener{

    private ImageView mBackBtn;
    private ListView mlist;
    private List<City> cityList;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.select_city);

        mBackBtn=(ImageView)findViewById(R.id.title_back);
        mBackBtn.setOnClickListener(this);
//        mlist = (ListView) findViewById(R.id.city_list);
//        MyApplication myApplication = (MyApplication) getApplication();
//        cityList = myApplication.getCityList();
//
//        List<Map<String, Object>> listems = new ArrayList<Map<String, Object>>();
//
//        for(City city : cityList){
//            Map<String, Object> listem = new HashMap<String, Object>();
//            listem.put("city",city.getCity());
//            listem.put("number",city.getNumber());
//            listems.add(listem);
//        }
//        SimpleAdapter simplead = new SimpleAdapter(this, listems,
//                R.id.city_list, new String[] { "city", "number"},
//                new int[] {R.id.list_city,R.id.list_number,});
//        mlist.setAdapter(simplead);
//        mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(SelectCity.this,"你单击了："+i,Toast.LENGTH_SHORT).show();
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.title_back:
                Intent i=new Intent();
                i.putExtra("cityCode","101160101");
                setResult(RESULT_OK,i);
                finish();
                break;
            default:
                break;
        }
    }
}
