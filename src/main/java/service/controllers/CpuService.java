package service.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.models.Cpu;
import service.repository.CpuRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CpuService {
    @Autowired
    private CpuRepository cpuRepository;


    public List<Cpu> getAllCPU() {
        List<Cpu> cpuList = new ArrayList<>();
        cpuRepository.findAll().forEach(cpuList::add);
        return cpuList;
    }

    public Optional<Cpu> getCpu(String id){
       return cpuRepository.findById(String.valueOf(id));
    }

    public void addCpu(Cpu cpu){
        cpuRepository.save(cpu);
    }
    public void uppdateCpu(String id, Cpu cpu){
        cpuRepository.save(cpu);
    }
    public void deleteCpu(Integer id){
        cpuRepository.deleteById(id);
    }
}
