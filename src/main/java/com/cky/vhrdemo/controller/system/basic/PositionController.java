package com.cky.vhrdemo.controller.system.basic;


import com.cky.vhrdemo.entity.Position;
import com.cky.vhrdemo.entity.RespBean;
import com.cky.vhrdemo.service.PositionService;
import com.cky.vhrdemo.utils.PoiUtils;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author dylan
 * @since 2020-04-23
 */
@RestController
@RequestMapping("/system/basic/pos")
public class PositionController {
    @Resource
    PositionService positionService;

//    @GetMapping("/")
//    public RespBean getAllPosition(){
//        List<Position> positions = positionService.getAllPositions();
//        return RespBean.ok("获取成功",positions);
//    }

    @GetMapping("/")
    public RespBean getPositionByPage(@RequestParam(defaultValue = "1") Integer page ,@RequestParam(defaultValue = "5") Integer size){
        PageInfo<Position> positions = positionService.getPositionByPage(page,size);
        return RespBean.ok("获取成功",positions);
    }

    @PostMapping("/")
    public RespBean addPosition(@RequestBody Position position) {
        if (positionService.addPosition(position) == 1) {
            return RespBean.ok("添加成功!");
        }
        return RespBean.error("添加失败!");
    }

    @PutMapping("/")
    public RespBean updatePositions(@RequestBody Position position) {
        if (positionService.updatePositions(position) == 1) {
            return RespBean.ok("更新成功!");
        }
        return RespBean.error("更新失败!");
    }
    @DeleteMapping("/{id}")
    public RespBean deletePosition(@PathVariable Integer id) {
        if(positionService.deletePositionById(id) == 1 ) {
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }

    @DeleteMapping("/")
    public RespBean deletePosition(Integer[] ids) {
        if(positionService.deletePositionsByIds(ids) == ids.length) {
            return RespBean.ok("批量删除成功");
        }
        return RespBean.error("批量删除失败");
    }

    @GetMapping("/export")
    @ApiOperation(value = "导出数据", notes = "将所有职位导出到excel")
    public ResponseEntity<byte[]> exportData() {
        List<Position> positions = positionService.getAllPositions();
        return PoiUtils.exportData(positions);
    }

    @PostMapping("/import")
    @ApiOperation(value = "导入数据", notes = "导入excel数据")
    public RespBean importData(MultipartFile file) throws IOException {
        List<Position> positions = PoiUtils.importData(file);
        if(positionService.addPositions(positions) == positions.size()) {
            return RespBean.ok("导入成功");
        }
        return RespBean.ok("导入失败");
    }
}
