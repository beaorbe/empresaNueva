package com.empresa.empresaNueva.dao;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("PEDIDO_MUJER")
public class PedidoMujer {
        private @Column("ID") @Id
        Integer DemoID;
        private @Column("KEY_NAME")
        String key;
        private @Column("FIRST_NAME")
        String Name;
        
    
        public Integer getDemoID() {
            return DemoID;
        }
        public String getKey() {
            return key;
        }
        public String getName() {
            return Name;
        }
    
        public void setDemoID(Integer demoID) {
            DemoID = demoID;
        }
        public void setKey(String key) {
            this.key = key;
        }
        public void setName(String name) {
            Name = name;
        }
       
        public PedidoMujer(Integer id, String key, String name) {
            this.DemoID = id;
            this.key = key;
            Name = name;
        }
        public PedidoMujer() {
            this.DemoID =0;
            this.key = "";
            Name = "";
        }
    }   
