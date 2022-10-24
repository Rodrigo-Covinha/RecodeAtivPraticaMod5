import axios from 'axios';


const AGENDAMENTO_API_BASE_URL = "http://localhost:8080/api/v1/agendamentos";

class AgendamentoService {
    getAgendamentos() {
        return axios.get(AGENDAMENTO_API_BASE_URL);
    }
    createAgendamento(agendamento) {
        return axios.post(AGENDAMENTO_API_BASE_URL, agendamento);
    }
    getAgendamentoById(agendamentoId) {
        return axios.get(AGENDAMENTO_API_BASE_URL + '/' + agendamentoId);
    }
    updateAgendamento(agendamento, agendamentoId) {
        return axios.put(AGENDAMENTO_API_BASE_URL + '/' + agendamentoId, agendamento);
    }
    deleteAgendamento(agendamentoId) {
        return axios.delete(AGENDAMENTO_API_BASE_URL + '/' + agendamentoId);
    }
}
export default new AgendamentoService()