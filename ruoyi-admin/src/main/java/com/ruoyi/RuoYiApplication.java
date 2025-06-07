package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);

        System.out.println("(♥◠‿◠)ﾉﾞ  酒店管理系统启动成功   ლ(´ڡ`ლ)ﾞ  \n");
//                " .-------.       ____     __        \n" +
//                " |  _ _   \\      \\   \\   /  /    \n" +
//                " | ( ' )  |       \\  _. /  '       \n" +
//                " |(_ o _) /        _( )_ .'         \n" +
//                " | (_,_).' __  ___(_ o _)'          \n" +
//                " |  |\\ \\  |  ||   |(_,_)'         \n" +
//                " |  | \\ `'   /|   `-'  /           \n" +
//                " |  |  \\    /  \\      /           \n" +
//                " ''-'   `'-'    `-..-'              ");
        System.out.println("                            _      _       \n" +
                "                           | |    | |      \n" +
                "   ___ ___  _ __ ___  _ __ | | ___| |_ ___ \n" +
                "  / __/ _ \\| '_ ` _ \\| '_ \\| |/ _ \\ __/ _ \\\n" +
                " | (_| (_) | | | | | | |_) | |  __/ ||  __/\n" +
                "  \\___\\___/|_| |_| |_| .__/|_|\\___|\\__\\___|\n" +
                "                     | |                   \n" +
                "                     |_|     ");
    }
}
