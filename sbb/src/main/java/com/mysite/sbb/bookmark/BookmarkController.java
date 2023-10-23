package com.mysite.sbb.bookmark;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class BookmarkController {

    @RequestMapping("/bookmarks")
    public String bookmarks(Model model) {
        return "bookmark_form";
    }
}


