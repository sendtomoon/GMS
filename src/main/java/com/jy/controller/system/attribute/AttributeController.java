package com.jy.controller.system.attribute;

import com.jy.controller.base.*;
import org.springframework.stereotype.*;
import com.jy.service.system.attribute.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.ui.*;
import com.jy.common.ajax.*;
import com.jy.common.utils.tree.entity.*;
import com.jy.common.mybatis.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.jy.entity.base.*;
import com.jy.entity.system.attribute.*;

@RequestMapping({ "/backstage/attribute/" })
@Controller
public class AttributeController extends BaseController<AttributeGroup>
{
    @Autowired
    private AttributeService attributeService;
    
    @RequestMapping(value = { "index" }, method = { RequestMethod.GET })
    public String index(final Model model) {
        if (this.doSecurityIntercept("1")) {
            model.addAttribute("permitBtn", (Object)this.getPermitBtn("2"));
            return "/system/attribute/attr_list";
        }
        return "/system/noAuthorized";
    }
    
    @RequestMapping(value = { "add" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes addAttrGroup(@RequestBody final AttributeGroup group) {
        final AjaxRes ar = this.getAjaxRes();
        try {
            this.attributeService.insertGroupAndItems(group);
            ar.setSucceedMsg("\u4fdd\u5b58\u6210\u529f");
        }
        catch (Exception e) {
            this.logger.error(e.toString(), (Throwable)e);
            ar.setFailMsg("\u4fdd\u5b58\u5931\u8d25");
        }
        return ar;
    }
    
    @RequestMapping(value = { "categoryTree" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes getCategoryTree() {
        final AjaxRes ar = this.getAjaxRes();
        try {
            final List<ZNodes> r = this.attributeService.getCategoryTree();
            ar.setSucceed(r);
        }
        catch (Exception e) {
            this.logger.error(e.toString(), (Throwable)e);
            ar.setFailMsg("\u6570\u636e\u83b7\u53d6\u5931\u8d25");
        }
        return ar;
    }
    
    @RequestMapping(value = { "update" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes updateAttrGroup(@RequestBody final AttributeGroup group) {
        final AjaxRes ar = this.getAjaxRes();
        try {
            final int res = this.attributeService.updateGroupAndItems(group);
            if (res == 1) {
                ar.setSucceedMsg("\u4fee\u6539\u6210\u529f");
            }
            else {
                ar.setFailMsg("\u4fee\u6539\u5931\u8d25");
            }
        }
        catch (Exception e) {
            this.logger.error(e.toString(), (Throwable)e);
            ar.setFailMsg("\u4fee\u6539\u5931\u8d25");
        }
        return ar;
    }
    
    @RequestMapping(value = { "findByPage" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes findByPage(final Page<AttributeGroup> page, final AttributeGroup group) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("1", "/backstage/attribute/index"))) {
            try {
                final Page<AttributeGroup> attrs = this.attributeService.findByPage(group, page);
                final Map<String, Object> p = new HashMap<String, Object>();
                p.put("permitBtn", this.getPermitBtn("3"));
                p.put("list", attrs);
                ar.setSucceed(p);
            }
            catch (Exception e) {
                this.logger.error(e.toString(), (Throwable)e);
                ar.setFailMsg("\u6570\u636e\u83b7\u53d6\u5931\u8d25");
            }
        }
        return ar;
    }
    
    @RequestMapping(value = { "find" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes find(final AttributeGroup group) {
        final AjaxRes ar = this.getAjaxRes();
        if (ar.setNoAuth(this.doSecurityIntercept("3"))) {
            try {
                final List<AttributeGroup> list = this.attributeService.find(group);
                final AttributeGroup obj = list.get(0);
                ar.setSucceed(obj);
            }
            catch (Exception e) {
                this.logger.error(e.toString(), (Throwable)e);
                ar.setFailMsg("\u6570\u636e\u83b7\u53d6\u5931\u8d25");
            }
        }
        return ar;
    }
    
    @RequestMapping(value = { "init" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes initAttrs(final AttributeGroup group) {
        final AjaxRes ar = this.getAjaxRes();
        try {
            final List<Attribute> list = this.attributeService.findAttrsByCid(group);
            ar.setSucceed(list);
        }
        catch (Exception e) {
            this.logger.error(e.toString(), (Throwable)e);
            ar.setFailMsg("\u6570\u636e\u83b7\u53d6\u5931\u8d25");
        }
        return ar;
    }
    
    @RequestMapping(value = { "select/{categoryId}" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<SelectData> selectAttrGroups(@PathVariable("categoryId") final String categoryId) {
        return this.attributeService.selectAttrGroups(categoryId);
    }
    
    @RequestMapping(value = { "getValues" }, method = { RequestMethod.POST })
    @ResponseBody
    public AjaxRes findAttrValuesByBid(AttributeValue value) {
        final AjaxRes ar = this.getAjaxRes();
        try {
            final List<AttributeValue> list = this.attributeService.findAttrValuesByBid(value);
            ar.setSucceed(list);
        }
        catch (Exception e) {
            this.logger.error(e.toString(), (Throwable)e);
            ar.setFailMsg("\u6570\u636e\u83b7\u53d6\u5931\u8d25");
        }
        return ar;
    }
    
    @RequestMapping(value = { "getDictItems" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<SelectData> findDictItems(final String dictId) {
        return this.attributeService.findDictItems(dictId);
    }
    
    @RequestMapping(value = { "findCode" }, method = { RequestMethod.POST })
    @ResponseBody
    public int findAttrCodeNum(final Attribute attribute) {
        return this.attributeService.findAttrCodeNum(attribute);
    }
    
    @RequestMapping(value = { "getDicts" }, method = { RequestMethod.POST })
    @ResponseBody
    public List<SelectData> getDictsByName(final String dictName) {
        return this.attributeService.getDictsByName(dictName);
    }
}
