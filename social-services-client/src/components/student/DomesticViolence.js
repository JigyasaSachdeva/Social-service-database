import React, { Component } from "react";
import { Card } from "react-bootstrap";
import SimpleText from "../input/SimpleText";
import SimpleDate from "../input/SimpleDate";
import SimpleDropdown from "../input/SimpleDropdown";
import PropTypes from "prop-types";
import { connect } from "react-redux";
import { updateStudentUI } from "../../actions/studentActions";

class DomesticViolence extends Component {
  constructor(props) {
    super(props);
    this.handlerChange = this.handlerChange.bind(this);
  }

  handlerChange(value, field) {
    this.props.updateStudentUI("domesticViolence", field, value);
  }

  render() {
    const info = this.props.student.student.domesticViolence;

    return (
      <Card.Body className="sfc-body">
        <SimpleDropdown
          label="Do you ever feel you or a family member/partner would resort to force when interacting?"
          options={this.props.data.booleanResponses}
          activeKey={info.question_1}
          handlerChange={this.handlerChange}
          field="question_1"
        ></SimpleDropdown>
        <SimpleDropdown
          label="In the past have you ever been involved in a violent relationship?"
            options={this.props.data.booleanResponses}
            activeKey={info.question_2}
            handlerChange={this.handlerChange}
            field="question_2"
            ></SimpleDropdown>
      </Card.Body>
    );
  }
}

DomesticViolence.propTypes = {
  student: PropTypes.object.isRequired,
};

DomesticViolence.defaultProps = {
  student: { DomesticViolence: {} },
};

const mapStateToProps = (state) => ({
  student: state.student,
});

const mapDispatchToProps = {
  updateStudentUI,
};

export default connect(mapStateToProps, mapDispatchToProps)(DomesticViolence);
