package com.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {
	@RequestMapping("/")
    @ResponseBody
    String home() {
        return "\n" + 
        		"\n" + 
        		"<!DOCTYPE html>\n" + 
        		"<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" + 
        		"<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" /><title>\n" + 
        		"	微信兼职平台\n" + 
        		"</title><meta name=\"keywords\" content=\"微信拉票 微信拉票平台 网络拉票 网络兼职\" /><meta name=\"description\" content=\"微信拉票平台旨在为大家提供一个诚实守信的网络兼职平台，为日益增加的网络拉票需要提供支持\" />\n" + 
        		"    <!-- start: META -->\n" + 
        		"    <meta charset=\"utf-8\" />\n" + 
        		"    <!--[if IE]><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,IE=9,IE=8,chrome=1\" /><![endif]-->\n" + 
        		"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\" /><meta name=\"apple-mobile-web-app-capable\" content=\"yes\" /><meta name=\"apple-mobile-web-app-status-bar-style\" content=\"black\" /><meta name=\"description\" /><meta name=\"author\" />\n" + 
        		"    <!-- end: META -->\n" + 
        		"    <!-- start: MAIN CSS -->\n" + 
        		"    <link rel=\"stylesheet\" href=\"http://css2.toupiao456.com/assets/plugins/bootstrap/css/bootstrap.min.css\" /><link rel=\"stylesheet\" href=\"http://css2.toupiao456.com/assets/plugins/font-awesome/css/font-awesome.min.css\" /><link rel=\"stylesheet\" href=\"http://css2.toupiao456.com/assets/fonts/style.css\" /><link rel=\"stylesheet\" href=\"http://css2.toupiao456.com/assets/css/main.css\" /><link rel=\"stylesheet\" href=\"http://css2.toupiao456.com/assets/css/main-responsive.css\" /><link id=\"skin_color\" rel=\"stylesheet\" href=\"http://css2.toupiao456.com/assets/css/theme_light.css\" type=\"text/css\" />\n" + 
        		"    <script src=\"http://css2.toupiao456.com/assets/js/jquery-2.0.3.min.js\"></script>\n" + 
        		"</head>\n" + 
        		"<body>\n" + 
        		" \n" + 
        		"    \n" + 
        		"\n" + 
        		"\n" + 
        		"\n" + 
        		"\n" + 
        		"<style type=\"text/css\">\n" + 
        		"    .nava {\n" + 
        		"        margin-left: 30px;\n" + 
        		"        font-size: 20px;\n" + 
        		"        line-height:42px;\n" + 
        		"    }\n" + 
        		"</style>\n" + 
        		"\n" + 
        		"<script src=\"http://oho2t3y1j.bkt.clouddn.com/js/dialog-plus-min.js\"></script>\n" + 
        		"<link href=\"http://oho2t3y1j.bkt.clouddn.com/js/ui-dialog.css\" rel=\"stylesheet\" />\n" + 
        		"<!-- start: HEADER -->\n" + 
        		"<div class=\"navbar navbar-inverse navbar-fixed-top\">\n" + 
        		"    <!-- start: TOP NAVIGATION CONTAINER -->\n" + 
        		"    <div class=\"container\">\n" + 
        		"        <div class=\"navbar-header\">\n" + 
        		"            <!-- start: RESPONSIVE MENU TOGGLER -->\n" + 
        		"            <button data-target=\".navbar-collapse\" data-toggle=\"collapse\" class=\"navbar-toggle\" type=\"button\">\n" + 
        		"                <span class=\"clip-list-2\"> 菜单</span>\n" + 
        		"            </button>\n" + 
        		"            <!-- end: RESPONSIVE MENU TOGGLER -->\n" + 
        		"            <!-- start: LOGO -->\n" + 
        		"            <a class=\"navbar-brand\" href=\"index.aspx\">[微信兼职平台]\n" + 
        		"            </a>\n" + 
        		"\n" + 
        		"            <!-- end: LOGO -->\n" + 
        		"        </div>\n" + 
        		"        <div class=\"navbar-tools\">\n" + 
        		"            \n" + 
        		"              \n" + 
        		"              \n" + 
        		"              <script type=\"text/javascript\">\n" + 
        		"\n" + 
        		"                $(function () {\n" + 
        		"                    var isShowError = 0;\n" + 
        		"                      if (isShowError > 0) {\n" + 
        		"                          var d = dialog({\n" + 
        		"                              title: '投票教学视频',\n" + 
        		"                              content: '由于您在近期的投票中出现了严重的失误<br/>让店小二带你去学习学习最新的投票教程吧O(∩_∩)O~',\n" + 
        		"                              ok: function () {\n" + 
        		"                                  window.location.href = \"/learn.aspx\";\n" + 
        		"                              },\n" + 
        		"                              cancel: function () {\n" + 
        		"                                 \n" + 
        		"                                  return false;\n" + 
        		"                              },\n" + 
        		"                              okValue: \"前去学习\",\n" + 
        		"                              cancelDisplay: false\n" + 
        		"                   \n" + 
        		"                          }).showModal();\n" + 
        		"           \n" + 
        		"                      }\n" + 
        		"                      var istuihui=0;\n" + 
        		"                    if(istuihui>0)\n" + 
        		"                    {\n" + 
        		"\n" + 
        		"\n" + 
        		"                        var d = dialog({\n" + 
        		"                            title: '提现退回提醒',\n" + 
        		"                            content: '亲，您昨天的佣金由于违规造成金额小于1元或微信没有进行实名制系统无法支付佣金已经返回到您的账号余额里O(∩_∩)O~',\n" + 
        		"                            ok: function () {\n" + 
        		"                                $.post(\"/tools/submit_ajax.ashx?action=tixiantxupdate\", {  }, function (data) {\n" + 
        		"                                \n" + 
        		"                                \n" + 
        		"                                })\n" + 
        		"                            },\n" + 
        		"                            cancel: function () {\n" + 
        		"                                $.post(\"/tools/submit_ajax.ashx?action=tixiantxupdate\", {  }, function (data) {\n" + 
        		"                                \n" + 
        		"                                    window.location.href = \"/tousu.aspx\";\n" + 
        		"                                })\n" + 
        		"                                \n" + 
        		"                            },\n" + 
        		"                            okValue: \"我知道了\",\n" + 
        		"                            cancelValue:\"查看被投诉任务\"\n" + 
        		"                   \n" + 
        		"                        }).showModal();\n" + 
        		"                    }\n" + 
        		"                    \n" + 
        		"                     var nobind=0;\n" + 
        		"                    if(nobind>0)\n" + 
        		"                    {\n" + 
        		"                        var d = dialog({\n" + 
        		"                            title: '提现退回提醒',\n" + 
        		"                            content: '亲，由于您在近期提现过程中解除了微信公众号的微信兼职平台账户绑定。<br/>系统无法支付佣金已经返回到您的账号余额里O(∩_∩)O~',\n" + 
        		"                            ok: function () {\n" + 
        		"                                $.post(\"/tools/submit_ajax.ashx?action=tixiantxupdatebind\", {  }, function (data) {\n" + 
        		"                                \n" + 
        		"                                \n" + 
        		"                                })\n" + 
        		"                            },\n" + 
        		"                            cancel: function () {\n" + 
        		"                                $.post(\"/tools/submit_ajax.ashx?action=tixiantxupdatebind\", {  }, function (data) {\n" + 
        		"                                \n" + 
        		"                                    window.location.href = \"/tixian.aspx\";\n" + 
        		"                                })\n" + 
        		"                                \n" + 
        		"                            },\n" + 
        		"                            okValue: \"我知道了\",\n" + 
        		"                            cancelValue:\"查看记录\"\n" + 
        		"                   \n" + 
        		"                        }).showModal();\n" + 
        		"                    }\n" + 
        		"                  })\n" + 
        		"            </script>\n" + 
        		"            <!-- start: TOP NAVIGATION MENU -->\n" + 
        		"            <ul class=\"nav navbar-right\">\n" + 
        		"\n" + 
        		"                <!-- start: USER DROPDOWN -->\n" + 
        		"                <li class=\"dropdown current-user\">\n" + 
        		"                    <a data-toggle=\"dropdown\" data-hover=\"dropdown\" class=\"dropdown-toggle\" data-close-others=\"true\" href=\"#\">\n" + 
        		"\n" + 
        		"                        <span class=\"username\">1096807215@qq.com</span>\n" + 
        		"                        <i class=\"clip-chevron-down\"></i>\n" + 
        		"                    </a>\n" + 
        		"                    <ul class=\"dropdown-menu\">\n" + 
        		"                        <li>\n" + 
        		"                            <a href=\"info.aspx\">\n" + 
        		"                                <i class=\"clip-user-2\"></i>\n" + 
        		"                                &nbsp;个人信息\n" + 
        		"                            </a>\n" + 
        		"                        </li>\n" + 
        		"\n" + 
        		"                        <li class=\"divider\"></li>\n" + 
        		"                        <li>\n" + 
        		"                            <a href=\"pwd.aspx\"><i class=\"clip-locked\"></i>\n" + 
        		"                                &nbsp;修改密码 </a>\n" + 
        		"                        </li>\n" + 
        		"                        <li>\n" + 
        		"                            <a href=\"exit.aspx\">\n" + 
        		"                                <i class=\"clip-exit\"></i>\n" + 
        		"                                &nbsp;注销\n" + 
        		"                            </a>\n" + 
        		"                        </li>\n" + 
        		"                    </ul>\n" + 
        		"                </li>\n" + 
        		"                <!-- end: USER DROPDOWN -->\n" + 
        		"            </ul>\n" + 
        		"            <!-- end: TOP NAVIGATION MENU -->\n" + 
        		"            \n" + 
        		"        </div>\n" + 
        		"    </div>\n" + 
        		"    <!-- end: TOP NAVIGATION CONTAINER -->\n" + 
        		"</div>\n" + 
        		"\n" + 
        		"\n" + 
        		"\n" + 
        		"\n" + 
        		"\n" + 
        		" \n" + 
        		"<!-- headerbar -->\n" + 
        		"\n" + 
        		"    <div class=\"main-container\">\n" + 
        		"        \n" + 
        		"\n" + 
        		"\n" + 
        		"<div class=\"navbar-content\">\n" + 
        		"    <!-- start: SIDEBAR -->\n" + 
        		"    <div class=\"main-navigation navbar-collapse collapse\" style=\"min-height: 454px; height: 0px;\">\n" + 
        		"        <!-- start: MAIN MENU TOGGLER BUTTON -->\n" + 
        		"        <div class=\"navigation-toggler\">\n" + 
        		"            <i class=\"clip-chevron-left\"></i>\n" + 
        		"            <i class=\"clip-chevron-right\"></i>\n" + 
        		"        </div>\n" + 
        		"        <!-- end: MAIN MENU TOGGLER BUTTON -->\n" + 
        		"        <!-- start: MAIN NAVIGATION MENU -->\n" + 
        		"        <ul class=\"main-navigation-menu\">\n" + 
        		"\n" + 
        		"            \n" + 
        		"              \n" + 
        		"              \n" + 
        		"              \n" + 
        		"              \n" + 
        		"            <li class=\"open\">\n" + 
        		"                <a href=\"javascript:void(0)\"><i class=\"clip-screen\"></i>\n" + 
        		"                    <span class=\"title\">个人信息 </span><i class=\"icon-arrow\"></i>\n" + 
        		"                    <span class=\"selected\"></span>\n" + 
        		"                </a>\n" + 
        		"                <ul class=\"sub-menu\" style=\"display: block;\">\n" + 
        		"                    <li>\n" + 
        		"                        <a href=\"info.aspx\">\n" + 
        		"                            <span class=\"title\">个人资料</span>\n" + 
        		"\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"                    <li>\n" + 
        		"                        <a href=\"pwd.aspx\">\n" + 
        		"                            <span class=\"title\">修改密码</span>\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"                    <li>\n" + 
        		"                        <a href=\"payinfo.aspx\">\n" + 
        		"                            <span class=\"title\">账户详情 </span>\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"                    <li>\n" + 
        		"                        <a href=\"xianxia.aspx\">\n" + 
        		"                            <span class=\"title\">我的下线 </span>\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"                   <li>\n" + 
        		"                        <a href=\"tixian.aspx\">\n" + 
        		"                            <span class=\"title\">提现记录 </span>\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"                    <li>\n" + 
        		"                        <a href=\"exit.aspx\">\n" + 
        		"                            <span class=\"title\">安全退出</span>\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"\n" + 
        		"                </ul>\n" + 
        		"            </li>\n" + 
        		"            <li class=\"open\">\n" + 
        		"                <a href=\"javascript:void(0)\"><i class=\"clip-cursor\"></i>\n" + 
        		"                    <span class=\"title\">任务中心 </span><i class=\"icon-arrow\"></i>\n" + 
        		"                    <span class=\"selected\"></span>\n" + 
        		"                </a>\n" + 
        		"                <ul class=\"sub-menu\" style=\"display: block;\">\n" + 
        		"                    <li>\n" + 
        		"                         \n" + 
        		"                        <a href=\"work.aspx\">\n" + 
        		"                            <span class=\"title\">进行中任务</span>\n" + 
        		"\n" + 
        		"                        </a>\n" + 
        		"                      \n" + 
        		"                    </li>\n" + 
        		"                    <li>\n" + 
        		"                        <a href=\"mywork.aspx\">\n" + 
        		"                            <span class=\"title\">做过的任务</span>\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"                      \n" + 
        		"                    <li>\n" + 
        		"                        <a href=\"tousu.aspx\">\n" + 
        		"                            <span class=\"title\">被投诉的任务 </span>\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"                     \n" + 
        		"                </ul>\n" + 
        		"            </li>\n" + 
        		"            <li>\n" + 
        		"                <a href=\"javascript:void(0)\"><i class=\"clip-cog-2\"></i>\n" + 
        		"                    <span class=\"title\">帮助中心 </span><i class=\"icon-arrow\"></i>\n" + 
        		"                    <span class=\"selected\"></span>\n" + 
        		"                </a>\n" + 
        		"                <ul class=\"sub-menu\" >\n" + 
        		"                    <li>\n" + 
        		"                        <a href=\"help.aspx\">\n" + 
        		"                            <span class=\"title\">新手帮助</span>\n" + 
        		"\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"                    <li>\n" + 
        		"                        <a href=\"introduce.aspx\">\n" + 
        		"                            <span class=\"title\">平台介绍</span>\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"                    <li>\n" + 
        		"                        <a href=\"contact.aspx\">\n" + 
        		"                            <span class=\"title\">联系方式 </span>\n" + 
        		"                        </a>\n" + 
        		"                    </li>\n" + 
        		"                </ul>\n" + 
        		"            </li>\n" + 
        		"            \n" + 
        		"        </ul>\n" + 
        		"        <!-- end: MAIN NAVIGATION MENU -->\n" + 
        		"    </div>\n" + 
        		"    <!-- end: SIDEBAR -->\n" + 
        		"</div>\n" + 
        		"\n" + 
        		"\n" + 
        		"\n" + 
        		"        <!-- start: PAGE -->\n" + 
        		"        <div class=\"main-content\">\n" + 
        		"           \n" + 
        		"           \n" + 
        		"            <div class=\"container\" style=\"min-height: 760px;\">\n" + 
        		"                <!-- start: PAGE HEADER -->\n" + 
        		"                <div class=\"row\">\n" + 
        		"                    <div class=\"col-sm-12\">\n" + 
        		"\n" + 
        		"                        <!-- start: PAGE TITLE & BREADCRUMB -->\n" + 
        		"                        <ol class=\"breadcrumb\">\n" + 
        		"                             \n" + 
        		"\n" + 
        		"                            <li>\n" + 
        		"                                <i class=\"clip-home-3\"></i>\n" + 
        		"                                  <a href=\"work.aspx\">点击进入最新任务&nbsp;&nbsp;&nbsp;&nbsp;\n" + 
        		"                                </a><a style=\"color:red\" href=\"helpshow.aspx?id=24\">推荐好友拿佣金</a>\n" + 
        		"                            </li>\n" + 
        		"                          \n" + 
        		"\n" + 
        		"                            \n" + 
        		"\n" + 
        		"                        </ol>\n" + 
        		"                        <div class=\"page-header\">\n" + 
        		"                            <h1>\n" + 
        		"                                平台公告\n" + 
        		"                                <small></small></h1>\n" + 
        		"                        </div>\n" + 
        		"                        <!-- end: PAGE TITLE & BREADCRUMB -->\n" + 
        		"                    </div>\n" + 
        		"                </div>\n" + 
        		"                <!-- end: PAGE HEADER -->\n" + 
        		"                <!-- start: PAGE CONTENT -->\n" + 
        		"                <div class=\"row\">\n" + 
        		"                    <div class=\"col-sm-12\">\n" + 
        		"                        <div class=\"core-box\">\n" + 
        		"\n" + 
        		"                            <div class=\"content\">\n" + 
        		"                                <p>\n" + 
        		"	<b><span style=\"font-size:16px;color:#E53333;\"><span style=\"color:#337FE5;\">部分用户无法做评论任务的问题已经解决了，可放心接评论任务</span></span></b>\n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<b><span style=\"font-size:16px;color:#E53333;\"><span style=\"color:#337FE5;\"><strong><a href=\"http://tu.toupiao456.com/320089656757491848.png\" target=\"_blank\">如有推广合作业务需求请联系接单客服</a></strong></span><span style=\"font-family:&quot;font-size:16px;color:#337FE5;\"><strong>微信号：</strong></span><span style=\"font-family:&quot;font-size:16px;\"><strong>2188050059 <span style=\"color:#009900;\">推荐朋友做任务的，请重新在平台里获取推荐链接</span></strong></span></span></b> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<b><span style=\"font-size:14px;\">郑重提示，平台不存在任何形式的收费行为，不存在高级会员费，不存在培训费，至始至终都不会收取一分钱，也不存在先交钱后返还，每个人都可以凭自己的劳动获得佣金。</span></b> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<b><b><span style=\"font-size:16px;color:#E53333;\"><span style=\"color:#E56600;\">如遇到上传不了，请在浏览器里打开平台接任务和上传图片，或者更换浏览器便可，</span><b><span style=\"color:#E56600;\">不要在微信里打开平台提交图片</span><b><span style=\"color:#99BB00;\">（如果上传时截屏出现报错建议切换下网络或者更换下浏览器）</span></b></b></span></b><br />\n" + 
        		"</b> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<strong><span style=\"color:#E53333;font-family:'Open+Sans', sans-serif;font-size:16px;line-height:20px;background-color:#FFFFFF;\">如果你不明白怎么做任务，一定要添加客服QQ 800197666 我们客服会手把手教你怎么正确做，如果是手机添加QQ 添加的时候请选择公众号，由于咨询量比较大，请大家耐心等待，平台的最新消息将通过此QQ发送。</span></strong> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<strong><span style=\"color:#E53333;font-family:'Open+Sans', sans-serif;font-size:16px;line-height:20px;background-color:#FFFFFF;\"><span style=\"color:#337FE5;\">建议把任务网址收藏到浏览器里添加书签，平时做任务的时候在浏览器里打开平台接任务，然后复制任务给出的链接粘贴到微信里打开做任务，截屏以后去浏览器上传图片，这样很方便。</span></span></strong> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span><span style=\"font-size:16px;line-height:20px;background-color:#FFFFFF;\"><b><a href=\"/helpshow.aspx?id=26\"><span style=\"color:#337FE5;\">强烈推荐新手点我一定要看平台常见问题</span><span style=\"color:#337FE5;\">避免账号违规被封</span><span style=\"color:#337FE5;\">后悔莫及</span></a></b></span></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:16px;line-height:20px;background-color:#FFFFFF;\">平台已经更新最新新手视频教程</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:16px;line-height:20px;background-color:#FFFFFF;\"><a target=\"_blank\" href=\"http://www.toupiao345.com/demo.html\">http://www.98toupiao.com/demo.html</a><br />\n" + 
        		"</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<strong><span style=\"color:#E53333;font-family:'Open+Sans', sans-serif;font-size:16px;line-height:20px;background-color:#FFFFFF;\"><span style=\"color:#009900;font-size:16px;line-height:20px;background-color:#FFFFFF;\">推荐大家自己多申请一个手机号，用来平时做注册任务接受短信验证码用，还有绑定银行卡的任务，如果想安心做可以自己申请一个空的银行卡里面不要放钱去做注册任务，还有一些下载任务，建议大家自己多准备一个做任务的手机，这个任务就是用来做注册和下载，很便宜的那种能下载app的安卓手机即可，随便做也不会出现安全问题。注册和下载任务相对单价较高，特别是下载任务每个都是1块钱或者更高。</span></span></strong> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span><span style=\"font-size:16px;line-height:20px;color:#E56600;background-color:#FFFFFF;\"><b>&nbsp; 平台上但凡是需要垫付超过2元以上的任务都不要去做，甭管任务说的天花乱坠，什么高收益理财，全部不要相信。大家提高安全意识，如果遇到不明白的东西可以联系我们客服帮您识别是否有风险。</b><br />\n" + 
        		"</span></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"color:#FF9900;\"><span style=\"font-size:16px;line-height:20px;color:#FF9900;background-color:#FFFFFF;\">大家上传的每个图片我们客服和商家都会在统一时间多重审核，但凡是不按要求乱做乱上传图片的就算上传上最后我们还会审核到，会封号处理佣金不退。</span></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"color:#FF9900;\"><span style=\"font-size:16px;line-height:20px;color:#FF9900;background-color:#FFFFFF;\"><b><b><b><b><b><b><b><strong><strong><span style=\"font-size:16px;\"><span style=\"font-size:14px;color:#E53333;\"><b>①&nbsp;</b></span><strong><a href=\"/demo.html\"><span style=\"font-size:14px;\">全程视频演示点击我了解，强烈新手看本视频教程，从头到尾详细讲解</span></a></strong></span></strong></strong></b></b></b></b></b></b></b><br />\n" + 
        		"</span></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"color:#E53333;font-size:14px;\"><strong>② </strong></span><b><span style=\"font-size:14px;\">如出现网址无法打开，可在uc浏览器打开平台账户详情获取新地址（老地址永久可用）。</span><span style=\"font-size:14px;\">以前的账号可直接登录所有都一样，推荐链接变更了,旧链接还可用，推荐的人不会变。告知身边的小伙伴，如果原来的地址不可用就用新地址登陆吧</span></b> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:14px;\"><span style=\"font-size:14px;line-height:20px;background-color:#FFFFFF;\"><b><span style=\"color:#E53333;\">③</span> 最近发现有不良商家发布让加群或者加微信号的任务，大家千万别加，加上去后是被忽悠着玩赌博诈骗等任务的。平台将加强商家审核保障任务的合法和大家的安全。</b></span></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span><span style=\"font-size:18px;line-height:27px;\"><b><b><b><b><strong><span style=\"font-size:14px;color:#FF9900;\"><span style=\"color:#E53333;\">④</span>&nbsp;</span></strong></b></b></b><span style=\"font-size:14px;color:#FF9900;\">平台分了几种任务类型，简单任务、注册任务和下载任务，只想做普通任务的亲可以点击一下普通任务选项就可以只做普通任务了。其他类型的任务价格较高，可以穿插着做。大家一定要按照任务要求的去做别省事，个别任务要求过分的可投诉到我们客服</span><br />\n" + 
        		"</b></span></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span><span style=\"font-size:18px;line-height:27px;\"><b><b><b><b><strong><span style=\"font-size:14px;\"><span style=\"color:#E53333;\">⑤&nbsp;</span><span style=\"color:#000000;\">如果之前正常做任务后来发现无法正常上传任务截屏，或者里面的网址无法复制，建议卸载浏览器重新安装浏览器就可以恢复正常</span></span></strong></b></b></b></b></span></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<b><b><b><b><b><strong><strong><span style=\"font-size:16px;\"><span style=\"font-size:14px;\"><span style=\"color:#E53333;\">⑥</span>&nbsp;</span><span style=\"color:#E53333;font-size:14px;\">大家千万别在要做的公众号里发送平台公布的链接地址和其他信息，可以加自己的小号微信，然后设置置顶聊天即可。或者把微信里的【文件传输助手】置顶</span></span></strong></strong></b></b></b></b></b> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<b><span style=\"font-size:16px;\"><span style=\"font-size:14px;\"><span style=\"color:#E53333;\">⑦ </span>近期发现部分人上传和任务不相关、没有投成功的截屏、或者借朋友的截屏上传，</span><span style=\"color:#E53333;font-size:14px;\">从现在开始对于故意作弊的发现一次作弊上传记录直接清零账号余额</span><span style=\"font-size:14px;\">。不要为了那一单的费用，导致整个账号余额被扣。得不偿失！！</span></span><br />\n" + 
        		"</b> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<b><strong><span style=\"font-size:14px;\"><span style=\"color:#E53333;\">⑧</span> MP类型的任务带（已选）字样的，</span><span style=\"color:#E53333;font-size:14px;\">截屏一定要显示出来选手+（已选）</span><span style=\"font-size:14px;\">，如果任务要求拼图，必须截屏投前和投后拼图，无拼图无佣金，如果做MP类型任务提示已经做过，不要再上传，防止被封账号</span></strong></b> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span><span style=\"font-size:18px;line-height:27px;\"><b><span style=\"font-size:14px;\"><span style=\"color:#E53333;\">⑨</span> 近期有些人在咱们系统恶意发放广告， 已经有投手反馈上当受骗，请大家不要轻信非正规的兼职渠道。如再发现可疑广告或任务，举报核实有红包奖励。</span></b></span></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"line-height:1.5;font-size:14px;\"><span style=\"font-size:14px;color:#000000;background-color:#FFFFFF;\"><strong><span style=\"color:#E53333;\">⑩</span> 如果做任务的时候出现任务过期，或者任务结束可点击【报告任务过期】提醒我们下架任务</strong></span></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<br />\n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<br />\n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:24px;color:#E53333;\"><strong>工资</strong></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\">1、工资是隔天结算，佣金大于5元即可提现，比如今天提现</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\">明天的晚上24点之前到账。</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\">2、单个任务一般0.1元到3元之间，根据任务的难易程度不等。</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\">操作熟练后每分钟可做2~5个任务</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\">3、<span style=\"color:#E53333;\">严禁各种作弊形式，发行作弊账号被封，余额清零。</span></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<br />\n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:24px;color:#E53333;\"><strong>奖励</strong></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\">推荐好友注册，获取高额推广奖励，活动推广期间，</span><span style=\"font-size:18px;line-height:1.5;\">好友</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\"><span style=\"color:#E53333;\">合格任务</span>总收入的<span style=\"color:#E53333;\">10%，从平台利润中拿出</span>作为你的推广奖励，</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\">奖励永久有效。点击账户详情里，会看到属于自己的专属链接，</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;line-height:27px;\">发送给别人注册，他就是你的下线。</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<br />\n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:24px;color:#E53333;\"><strong>教程</strong></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\">简要概括文字版：</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\">填写信息，注册账号，点击提现的时候提示绑定微信</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\">登录后：</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;background-color:#CCCCCC;\">任务中心——进行中的任务——开始任务</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:18px;\"><a href=\"/help.aspx\" target=\"_blank\">图文教程</a>：</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<br />\n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:24px;color:#E53333;\"><strong>规则</strong></span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<br />\n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:16px;\">1、使用手机或平台在微信上做任务，一个任务一个微信号只能做一次</span><span style=\"font-size:16px;line-height:1.5;\">，</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:16px;line-height:1.5;\">部分任务可每天投一次，平台有防作弊机制，一旦发现，永久封号佣金不退</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:16px;\">2、建议使用UC浏览器打开平台接任务查看任务要求，然后去微信里根据任务</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:16px;line-height:1.5;\">要求做任务，不要在QQ或者微信里打开平台上传图片，兼容性不好</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:16px;\">3、在微信里做任务的时候一定记住需要快速截屏，系统审核只认做成功提示，</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:16px;\">其他提示不合格无佣金，如果是闪图显示特别快的，可再次提交一次截屏</span><br />\n" + 
        		"<span style=\"font-size:16px;\">4、平台对于注册多个账号用一个任务截屏的用户是0容忍发现一个封一个，</span> \n" + 
        		"</p>\n" + 
        		"<p>\n" + 
        		"	<span style=\"font-size:16px;\">请勿做得不偿失的事情。</span><br />\n" + 
        		"<span style=\"font-size:16px;\"></span> \n" + 
        		"</p>\n" + 
        		"                            </div>\n" + 
        		"\n" + 
        		"                        </div>\n" + 
        		"                    </div>\n" + 
        		"\n" + 
        		"                </div>\n" + 
        		"\n" + 
        		"                <!-- end: PAGE CONTENT-->\n" + 
        		"            </div>\n" + 
        		"        </div>\n" + 
        		"        <!-- end: PAGE -->\n" + 
        		"    </div>\n" + 
        		"<div class=\"footer clearfix\">\n" + 
        		"    <div class=\"footer-inner\" style=\"text-align: center; float: none\">\n" + 
        		"        2017 &copy; 微信兼职平台  备案号：<a href=\"http://www.miitbeian.gov.cn/state/outPortal/loginPortal.action\">豫ICP备15023452号</a>\n" + 
        		"    </div>\n" + 
        		"    <div class=\"footer-items\">\n" + 
        		"        <span class=\"go-top\"><i class=\"clip-chevron-up\"></i></span>\n" + 
        		"    </div>\n" + 
        		"</div>\n" + 
        		"<script src=\"http://s4.cnzz.com/z_stat.php?id=1256602797&web_id=1256602797 \" language=\"JavaScript\"></script>\n" + 
        		"<script type=\"text/javascript\">\n" + 
        		"    $(function() {\n" + 
        		"    $(\"a[title='站长统计']\").hide();\n" + 
        		"    })\n" + 
        		"</script>\n" + 
        		"    <!--<![endif]-->\n" + 
        		"    <script src=\"http://css2.toupiao456.com/assets/plugins/jquery-ui/jquery-ui-1.10.2.custom.min.js\"></script>\n" + 
        		"    <script src=\"http://css2.toupiao456.com/assets/plugins/bootstrap/js/bootstrap.min.js\"></script>\n" + 
        		"    <script src=\"http://css2.toupiao456.com/assets/plugins/perfect-scrollbar/src/jquery.mousewheel.js\"></script>\n" + 
        		"    <script src=\"http://css2.toupiao456.com/assets/plugins/perfect-scrollbar/src/perfect-scrollbar.js\"></script>\n" + 
        		"    <script src=\"http://css2.toupiao456.com/assets/plugins/less/less-1.5.0.min.js\"></script>\n" + 
        		"    <script src=\"http://css2.toupiao456.com/assets/plugins/jquery-cookie/jquery.cookie.js\"></script>\n" + 
        		"    <script src=\"http://css2.toupiao456.com/assets/js/main.js\"></script>\n" + 
        		"    <!-- end: MAIN JAVASCRIPTS -->\n" + 
        		"    <script>\n" + 
        		"        jQuery(document).ready(function () {\n" + 
        		"            Main.init();\n" + 
        		"        });\n" + 
        		"    </script>\n" + 
        		"\n" + 
        		"</body>\n" + 
        		"</html>\n" + 
        		"";
    }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
