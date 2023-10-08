package com.muhammedbaskan.notalma;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.muhammedbaskan.entity.Note;
import com.muhammedbaskan.security.LoginFilter;
import com.muhammedbaskan.service.MailService;
import com.muhammedbaskan.service.NoteService;

@Controller
public class HomeController {
	
	public static String url = "http://localhost:8082/notalma";
	
	@Autowired
	private NoteService noteService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpServletRequest req) {
		
		return "redirect:/index";

	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homes(Model model, HttpServletRequest req) {
				
		return "redirect:/index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model, HttpServletRequest req) {
				
		model.addAttribute("user",req.getSession().getAttribute("user"));
		
        System.out.println(req.getRemoteAddr());
		
		model.addAttribute("Ba�l�k", "Notlar�m");
		
		model.addAttribute("serverTime", "/");
		
		model.addAttribute("notlar",noteService.getAll(1l));
		
		return "index";
		
	}
	
	
	@RequestMapping(value = "/detay/{id}", method = RequestMethod.GET)
	public String home(@PathVariable("id") Long id, Model model) {
		
		model.addAttribute("id",id);
			
		return "detail";
	}
	
	@RequestMapping(value = "/ekle", method = RequestMethod.GET)
	public String home(Model model) {
		
		return "addNote";
	}
	
	@RequestMapping(value = "/error_404", method = RequestMethod.GET)
	public String error(Model model) {
		
		return "error_404";
	}
	
	@RequestMapping(value="/addNote", method=RequestMethod.POST)
	public ResponseEntity<String> addNote(@RequestBody Note note, HttpServletRequest request){
		
		System.out.println(note.toString());
		
	    noteService.createNote(note,request);
	    
		return new ResponseEntity<>("OK",HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/updateNote", method=RequestMethod.POST)
	public ResponseEntity<String> updateNote(@RequestBody Note note, HttpServletRequest request){
		
		Note oldNote = noteService.getNoteFindById(note.getId());
		oldNote.setTitle(note.getTitle());
		oldNote.setContent(note.getContent());
		
	    noteService.updateNote(oldNote,request);
	    
		return new ResponseEntity<>("OK",HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/deleteNote", method=RequestMethod.POST)
	public ResponseEntity<String> deleteNote(@RequestBody Note note, HttpServletRequest request){
		
		Note oldNote = noteService.getNoteFindById(note.getId());
		
	    noteService.deleteNote(oldNote,request);
	    
		return new ResponseEntity<>("OK",HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value="/getNotes", method=RequestMethod.POST)
	public ResponseEntity<ArrayList<Note>> getNotes (HttpServletRequest request){
		
		return new ResponseEntity<>(noteService.getAll(LoginFilter.user.getId()),HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/getNote", method=RequestMethod.POST)
	public ResponseEntity<Note> getNotes (@RequestBody Long id, HttpServletRequest request){
		  
		System.out.println(id);
		
		Note note = noteService.getNoteFindById(Long.parseLong(id));
		if(note.getUser_id().equals(LoginFilter.user.getId()))
		    return new ResponseEntity<>(noteService.getNoteFindById(Long.parseLong(id)),HttpStatus.CREATED);
	
		return new ResponseEntity<>(null,HttpStatus.CREATED);
	}
	
	
	
}
