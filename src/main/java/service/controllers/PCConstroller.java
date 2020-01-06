package service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.models.Cpu;

import java.util.List;
import java.util.Optional;

@RestController
public class PCConstroller {
    @Autowired
    private CpuService cpuService;

    @PostMapping("/addCpu")
    public void addCpu(@RequestBody Cpu newCpu) {
        cpuService.addCpu(newCpu);
    }

    @RequestMapping("/getAll")
    public List<Cpu> getAll() {
        return cpuService.getAllCPU();
    }

    @DeleteMapping("/deleteCpu")
    public void delete(Integer id) {
        cpuService.deleteCpu(id);
    }

    @PatchMapping("/updateCpu")
    public void updated(String id, @RequestBody Cpu newCpu) {
        cpuService.uppdateCpu(id, newCpu);
    }
    @RequestMapping("/getById")
    public Optional<Cpu> getCpu(String id){
        return cpuService.getCpu(id);
    }
}
