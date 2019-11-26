package cn.edu.zucc.musicmanager.service;

import javax.annotation.Resource;

import cn.edu.zucc.musicmanager.mapper.UserMapper;
import cn.edu.zucc.musicmanager.result.Chartdata;
import cn.edu.zucc.musicmanager.result.Chartpara;
import cn.edu.zucc.musicmanager.result.Chartres;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


@ComponentScan({"cn.edu.zucc.musicmanager.mapper"})
@Service("UserService")
public class UserService{


    @Resource
    private UserMapper userMapper;

    public ArrayList<String> getAllSignature(int offset){
        return userMapper.getAllSignature(offset);
    }

    public ArrayList<Chartres> getuserGender(){
        return userMapper.getuserGender();
    }

    public ArrayList<Chartres> getuserArea(){
        return userMapper.getuserArea();
    }

    public ArrayList<Chartdata> getuserAge(){

        ArrayList<Long> birthdays = userMapper.getuserAge();
        ArrayList<Chartdata> res = new ArrayList<>();
        int[] count = new int[20];

        for (int i = 0;i<birthdays.size();i++)
        {
            Date date = new Date(birthdays.get(i));
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int year = calendar.get(Calendar.YEAR);
            if (year>=2010){
                count[7]++;
            }
            else if(year>=2000){
                count[6]++;
            }
            else if(year>=1990){
                count[5]++;
            }
            else if(year>=1980){
                count[4]++;
            }
            else if(year>=1970){
                count[3]++;
            }
            else if(year>=1960){
                count[2]++;
            }
            else if(year>=1950){
                count[1]++;
            }
            else{
                count[0]++;
            }
        }

        //res.add(new Chartdata("未知",count[0]));
        res.add(new Chartdata("50后",count[1]));
        res.add(new Chartdata("60后",count[2]));
        res.add(new Chartdata("70后",count[3]));
        res.add(new Chartdata("80后",count[4]));
        res.add(new Chartdata("90后",count[5]));
        res.add(new Chartdata("00后",count[6]));
        res.add(new Chartdata("10后",count[7]));


        return res;
    }

    public ArrayList<Chartdata> getuserFollows(){
        ArrayList<Chartdata> res = new ArrayList<Chartdata>();

        res.add(new Chartdata("0-50",userMapper.getuserFollows(new Chartpara(0,50))));
        res.add(new Chartdata("50-100",userMapper.getuserFollows(new Chartpara(50,100))));
        res.add(new Chartdata("100-1000",userMapper.getuserFollows(new Chartpara(100,1000))));
        res.add(new Chartdata("1000-",userMapper.getuserFollows(new Chartpara(1000,10000))));

        return res;
    }

    public ArrayList<Chartdata> getuserFollowed(){
        ArrayList<Chartdata> res = new ArrayList<Chartdata>();

        res.add(new Chartdata("0-50",userMapper.getuserFollowed(new Chartpara(0,50))));
        res.add(new Chartdata("50-100",userMapper.getuserFollowed(new Chartpara(50,100))));
        res.add(new Chartdata("100-1000",userMapper.getuserFollowed(new Chartpara(100,1000))));
        res.add(new Chartdata("1000-",userMapper.getuserFollowed(new Chartpara(1000,10000))));

        return res;
    }

    public ArrayList<Chartdata> getuserPlaylist(){
        ArrayList<Chartdata> res = new ArrayList<Chartdata>();

        res.add(new Chartdata("0-10",userMapper.getuserPlaylist(new Chartpara(0,10))));
        res.add(new Chartdata("10-40",userMapper.getuserPlaylist(new Chartpara(10,50))));
        res.add(new Chartdata("50-100",userMapper.getuserPlaylist(new Chartpara(50,100))));
        res.add(new Chartdata("100-",userMapper.getuserPlaylist(new Chartpara(100,10000))));

        return res;

    }

    public ArrayList<Chartdata> getuserEventcount(){
        ArrayList<Chartdata> res = new ArrayList<Chartdata>();

        res.add(new Chartdata("0-10",userMapper.getuserEventcount(new Chartpara(0,10))));
        res.add(new Chartdata("10-40",userMapper.getuserEventcount(new Chartpara(10,50))));
        res.add(new Chartdata("50-100",userMapper.getuserEventcount(new Chartpara(50,100))));
        res.add(new Chartdata("100-",userMapper.getuserEventcount(new Chartpara(100,10000))));

        return res;

    }
}
