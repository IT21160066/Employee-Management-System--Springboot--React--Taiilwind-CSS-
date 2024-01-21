import React from "react";

const Employee = ({ employee, deleteEmployee }) => {
  return (
    <tr key={employee.empId}>
      <td className="text-left px-6 py-4 whitespace-nowrap">
        <div className="text-sm text-gray-500">{employee.firstName}</div>
      </td>
      <td className="text-left px-6 py-4 whitespace-nowrap">
        <div className="text-sm text-gray-500">{employee.lastName}</div>
      </td>
      <td className="text-left px-6 py-4 whitespace-nowrap">
        <div className="text-sm text-gray-500">{employee.emailID}</div>
      </td>
      <td className="text-right px-6 py-4 whitespace-nowrap font-medium text-sm">
        <a href="#" className="text-indigo-600 hover:text-indigo-800 px-4">
          Edit
        </a>
        <a
          onClick={(e) => deleteEmployee(e, employee.empId)}
          className="text-indigo-600 hover:text-indigo-800 hover:cursor-pointer"
        >
          Delete
        </a>
      </td>
    </tr>
  );
};

export default Employee;
