package my.sunghyuk.lifemusic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.common.exception.ResourceNotFoundException;
import my.sunghyuk.lifemusic.domain.Record;
import my.sunghyuk.lifemusic.service.RecordService;

@Controller
@RequestMapping(value = "/record")
public class RecordController {

	@Autowired
	private RecordService service;

	private static final Logger logger = LoggerFactory.getLogger(RecordController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "search-filter", required = false) String searchFilter,
			@RequestParam(required = false) String keywords) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("record/list");
		 mv.addObject("records", service.getAllRecords());

		return mv;
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(@RequestParam(value = "id") long id) {
		Record record = service.getRecordById(id);

		if (record == null)
			throw new ResourceNotFoundException();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("record/detail");
		mv.addObject("record", record);

		return mv;
	}

}