package com.itheima.Demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JD implements A{
    private String name;
    private boolean status;
    @Override
    public void press(){
        status = !status;
    }
}
