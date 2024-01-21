import axios from "axios";

const EMPLOYEE_BASE_URL = "http://localhost:8090/api/v1/employee";

class EmployeeService {
  saveEmployee(employee) {
    return axios.post(EMPLOYEE_BASE_URL, employee);
  }

  getEmployees() {
    return axios.get(EMPLOYEE_BASE_URL);
  }

  async deleteEmployee(empId) {
    try {
      const response = await axios.delete(EMPLOYEE_BASE_URL + "/" + empId);
      return response.data;
    } catch (error) {
      console.error("Error deleting employee:", error);
      throw error;
    }
  }

  getEmployeeById(empId) {
    return axios.get(EMPLOYEE_BASE_URL + "/" + empId);
  }

  updateEmployee(empId, employee) {
    return axios.put(`${EMPLOYEE_BASE_URL}/${empId}`, employee);
  }
}

export default new EmployeeService();
