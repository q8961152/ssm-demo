package com.education.ssm.controller.system;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.education.ssm.model.system.SystemDepartmentPo;
import com.education.ssm.service.system.SystemDepartmentService;

@Controller
@RequestMapping("/system/department")
public class SystemDepartmentController {

	private static final Logger logger = Logger.getLogger(SystemDepartmentController.class);

	private SystemDepartmentService systemDepartmentService;

	public SystemDepartmentService getSystemDepartmentService() {
		return systemDepartmentService;
	}

	@Autowired
	public void setSystemDepartmentService(SystemDepartmentService systemDepartmentService) {
		this.systemDepartmentService = systemDepartmentService;
	}

	@RequestMapping("/view/{id}")
	public String RESTful(HttpServletRequest request, @PathVariable String id) {
		SystemDepartmentPo po = systemDepartmentService.selectByPrimaryKey(id);
		request.setAttribute("bean", po);
		return "system/department/view";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam String id) {
		systemDepartmentService.deleteByPrimaryKey(id);
		return "redirect:/system/department/view?id=" + id;
	}

	@RequestMapping("/update")
	public String upate(SystemDepartmentPo po) {
		po.setEditTime(new Date());
		systemDepartmentService.updateByPrimaryKeySelective(po);
		return "redirect:/system/department/view?id=" + po.getId();
	}

	@RequestMapping("/edit")
	public String edit(HttpServletRequest request, @RequestParam String id) {
		SystemDepartmentPo po = systemDepartmentService.selectByPrimaryKey(id);
		request.setAttribute("bean", po);
		return "system/department/edit";
	}

	@RequestMapping("/save")
	public String save(SystemDepartmentPo po) {
		po.setCreateTime(new Date());
		systemDepartmentService.insert(po);
		return "redirect:/system/department/view?id=" + po.getId();
	}

	@RequestMapping("/view")
	public String view(HttpServletRequest request, @RequestParam String id) {
		SystemDepartmentPo po = systemDepartmentService.selectByPrimaryKey(id);
		request.setAttribute("bean", po);
		return "system/department/view";
	}
}
