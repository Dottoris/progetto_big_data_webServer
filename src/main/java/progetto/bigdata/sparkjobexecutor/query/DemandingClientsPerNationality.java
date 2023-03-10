package progetto.bigdata.sparkjobexecutor.query;

import progetto.bigdata.sparkjobexecutor.models.CoppiaNazionalitĂ ClientePunteggioMedio;

public enum DemandingClientsPerNationality implements Query<CoppiaNazionalitĂ ClientePunteggioMedio> {

    INSTANCE {
        @Override
        public CoppiaNazionalitĂ ClientePunteggioMedio build(String line) {
            String s = line.substring(1,line.length()-1);
            String[] tokens = s.split(",");
            return new CoppiaNazionalitĂ ClientePunteggioMedio(tokens[0],Double.valueOf(tokens[1]));
        }
    }
}
