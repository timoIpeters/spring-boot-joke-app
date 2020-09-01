package com.springtut.springbootjokeapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springtut.springbootjokeapp.services.JokeService;

@Controller
public class JokeController {
  private JokeService jokeService;

  @Autowired
  public JokeController(JokeService jokeService) {
    this.jokeService = jokeService;
  }

  public String showJoke(Model model){
    return null;
  }
}