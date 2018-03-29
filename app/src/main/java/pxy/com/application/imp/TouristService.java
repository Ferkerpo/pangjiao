package pxy.com.application.imp;

import com.pxy.pangjiao.compiler.mpv.annotation.Autowire;
import com.pxy.pangjiao.compiler.mpv.annotation.Presenter;

import pxy.com.adapter.protocol.RequestActive;
import pxy.com.adapter.protocol.ResponseActive;
import pxy.com.application.IMainActivityView;
import pxy.com.application.ITouristService;
import pxy.com.service.IAppService;
import pxy.com.service.imp.DefaultAppService;
import pxy.com.test.User;

/**
 * Created by Administrator on 2018/3/17.
 */

@Presenter
public class TouristService implements ITouristService {


    @Autowire(imp = DefaultAppService.class)
    public IAppService appService;

    private IMainActivityView view;

    @Override
    public void build(Object view) {
        this.view= (IMainActivityView) view;
    }

    @Override
    public void payCash(double money) {
        String fwetwe = appService.login("123", "fwetwe");
        view.showToast(fwetwe);
    }

    @Override
    public void active() {
        RequestActive active=new RequestActive();
        active.setActiveCode("123456");
        ResponseActive response = active.execute();

    }


    @Override
    public void onDestroy() {
        this.view=null;
    }


}
