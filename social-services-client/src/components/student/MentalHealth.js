import React, { Component } from "react";
import { Card } from "react-bootstrap";
import SimpleText from "../input/SimpleText";
import SimpleDate from "../input/SimpleDate";
import SimpleDropdown from "../input/SimpleDropdown";
import PropTypes from "prop-types";
import { connect } from "react-redux";
import { updateStudentUI } from "../../actions/studentActions";

class MentalHealth extends Component {
  constructor(props) {
    super(props);
    this.handlerChange = this.handlerChange.bind(this);
  }

  handlerChange(value, field) {
    this.props.updateStudentUI("mentalHealth", field, value);
  }

  render() {
    const info = this.props.student.student.mentalHealth;

    return (
      <Card.Body className="sfc-body">
        <SimpleDropdown
          label="Do you ever feel unsafe in your current living situation?"
          options={this.props.data.booleanResponses}
          activeKey={info.question_1}
          handlerChange={this.handlerChange}
          field="question_1"
        ></SimpleDropdown>
      </Card.Body>
    );
  }
}

MentalHealth.propTypes = {
  student: PropTypes.object.isRequired,
};

MentalHealth.defaultProps = {
  student: { MentalHealth: {} },
};

const mapStateToProps = (state) => ({
  student: state.student,
});

const mapDispatchToProps = {
  updateStudentUI,
};

export default connect(mapStateToProps, mapDispatchToProps)(MentalHealth);
