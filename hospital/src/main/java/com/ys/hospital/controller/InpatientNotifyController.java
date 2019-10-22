package com.ys.hospital.controller;

import com.ys.hospital.pojo.Employee;
import com.ys.hospital.pojo.InpatientNotify;
import com.ys.hospital.service.InpatientNotifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * (InpatientNotify)表控制层
 *
 * @author yusheng
 * @since 2019-10-10 08:09:39
 */
@Controller
@RequestMapping("/inpatientNotify")
public class InpatientNotifyController {
    private static final Logger logger = LoggerFactory.getLogger(InpatientNotifyController.class);
    
    @Resource
    private InpatientNotifyService inpatientNotifyService;
    
    @RequestMapping("/test")
    public String testDome() {
        logger.info("testDome success");
        return "redirect:/";
    }

    /**
     * 查询所有住院通知
     * @param model
     * @return
     */
    @RequestMapping("/queryAllInpatientNotify")
    public String queryAllInpatientNotify(Model model){
        List<InpatientNotify> inpatientNotifies=inpatientNotifyService.queryAllInpatientNotify();
        model.addAttribute("inpatientNotifies",inpatientNotifies);
        logger.info("queryAllInpatientNotify success");
        return "/nurse/inpatientNotify_list";
    }

    @RequestMapping("/queryInpatientNotifyByParam")
    public String queryInpatientNotifyByParam(InpatientNotify inpatientNotify,Model model){
        List<InpatientNotify> inpatientNotifies=inpatientNotifyService.queryInpatientNotifyByParam(inpatientNotify);
        model.addAttribute("inpatientNotifies", inpatientNotifies);
        return "/nurse/inpatientNotify_list";
    }
    /**
     * 通过登录人ID查询未处理住院通知
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/queryInpatientNotifyByEmployeeId")
    public String queryInpatientNotifyByEmployeeId(HttpSession session,Model model){
        //获取当前登录的用户
        Employee employee= (Employee) session.getAttribute("employee");
        List<InpatientNotify> inpatientNotifies=inpatientNotifyService.queryInpatientNotifyByEmployeeId(employee.getEmployeeId());
        model.addAttribute("inpatientNotifies",inpatientNotifies);
        return "/nurse/inpatientNotify_list";
    }

    /*@RequestMapping("/toInsertInpatientNotify")
    public String toInsertInpatientNotify(){
        logger.info("toInsertInpatientNotify success");
        return "/nurse/inpatientNotify_insert";
    }*/
    /*@RequestMapping("/insertInpatientNotify")
    public String insertInpatientNotify(InpatientNotify inpatientNotify){
        int count=inpatientNotifyService.insertInpatientNotify(inpatientNotify);
        logger.info("insertInpatientNotify success");
        if(count>0){
            return "redirect:/inpatientNotify/queryAllInpatientNotify";
        }
        return "redirect:/inpatientNotify/insertInpatientNotify";
    }*/
}