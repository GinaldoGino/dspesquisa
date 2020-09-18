import React from 'react';
import {Text, StyleSheet} from 'react-native';
import Header from '../../components/header';

const CreateRecords = () => {
    return(
        <>
            <Header />
            <Text style={styles.text}>Hello</Text>
        </>
    )
};

const styles = StyleSheet.create({
    text: {
      color: '#FFF',
      textAlign: 'center',
      marginTop: 100,
      fontSize: 50
    }
  });

export default CreateRecords;